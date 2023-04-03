package com.fa.mock.Controller.web;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fa.mock.Model.CustomerModel;
import com.fa.mock.Model.employee.CheckinOut;
import com.fa.mock.Model.web.Booking;
import com.fa.mock.Model.web.DetailBooking;
import com.fa.mock.Model.web.RoomType;
import com.fa.mock.Services.CustomerService;
import com.fa.mock.Services.admin.RoomService;
import com.fa.mock.Services.employee.CheckinService;
import com.fa.mock.Services.web.BookingService;
import com.fa.mock.Services.web.DetailBookingService;
import com.fa.mock.Services.web.RoomTypeService;

@Controller
public class BookingController {
	
	@Autowired
	RoomTypeService roomTypeService;
	
	@Autowired
	RoomService roomService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	DetailBookingService detailBookingService;
	
	@Autowired
	CheckinService checkinService;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate startDate, endDate;
	
	@GetMapping(value="/loai-phong")    
	public ModelAndView getRoomTypeController(HttpServletRequest request, HttpSession session) {
		ModelAndView mav = new ModelAndView("web/SearchRoomType");
		List<RoomType> list = roomTypeService.searchRoomTypes(startDate, endDate);
		mav.addObject("roomtypelist", list);
		return mav;
	}
	
	@PostMapping(value="/loai-phong")    
	public ModelAndView postRoomTypeController(HttpServletRequest request, HttpSession session) {
		String dateCheckin = request.getParameter("dateCheckin");
		String dateCheckout = request.getParameter("dateCheckout");
		session.setAttribute("dateCheckin", dateCheckin);
		session.setAttribute("dateCheckout", dateCheckout);
		ModelAndView mav;
		String message = "";
		if(dateCheckin == "" || dateCheckout == "") {
			mav = new ModelAndView("web/home");
			message = "Mời nhập Ngày Checkin/Checkout!!!";
			mav.addObject("message",message);
		}else {
			startDate = LocalDate.parse(dateCheckin);
			endDate = LocalDate.parse(dateCheckout);
			if(startDate.isAfter(endDate)) {
				mav = new ModelAndView("web/home");
				message = "Ngày Checkin/Checkout không hợp lệ!!!";
				mav.addObject("message",message);
			}else {
				mav = new ModelAndView("web/SearchRoomType");
				List<RoomType> list = roomTypeService.searchRoomTypes(startDate, endDate);
				mav.addObject("roomtypelist", list);
			}
		}
		mav.addObject("dateCheckin", dateCheckin);
		mav.addObject("dateCheckout", dateCheckout);
		return mav;
	}
	@GetMapping(value="/dat-phong")    
	public ModelAndView bookingController(HttpServletRequest request, HttpSession session) {
		ModelAndView mav = new ModelAndView("web/Booking");
		return mav;
	}
	@PostMapping(value="/dat-phong")    
	public ModelAndView pbookingController(HttpServletRequest request, HttpSession session) {
		ModelAndView mav = new ModelAndView("web/Booking");
		String[] listroom = (request.getParameter("listroom")).split(",");
		List<RoomType> listRoomType = new ArrayList<>();
		for (String id : listroom) {
			RoomType roomType =  roomTypeService.getRoomTypeById(id);
			listRoomType.add(roomType);
		}
		session.setAttribute("listRoomType", listRoomType);
//		mav.addObject("listRoomType", listRoomType);
		return mav;
	}
	
	@PostMapping(value="/thong-tin-dat-phong")    
	public ModelAndView infobookingController(HttpServletRequest request, HttpSession session) {
		ModelAndView mav = new ModelAndView("web/home");
//		session.removeAttribute();
		session.setMaxInactiveInterval(0);
		
		String idCustommer = "";
		String fullname = request.getParameter("fullnameCustommer");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String citizenId = request.getParameter("citizenId");
		String username;
		
		CustomerModel cus = (CustomerModel) session.getAttribute("custommer");
		if(cus == null) {
			username = null;
		}
		else {
			username = cus.getUserName();
			idCustommer = cus.getIdCustomer();
		}
		boolean existsCustommer = customerService.checkExistsCustommer(citizenId);
		
		if(!existsCustommer) {
			idCustommer = customerService.getIdCustommer();
			CustomerModel newcustomer = new CustomerModel(idCustommer, fullname, phone, email, citizenId, username);
			customerService.insertCustomerBooking(newcustomer);
		}
		String idBooking = bookingService.setBookingID();
		String dateCheckin = (String) session.getAttribute("dateCheckin");
		String dateCheckout = (String) session.getAttribute("dateCheckout");
		String dateBook = (LocalDateTime.now()).format(DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss"));
		
		Booking booking = new Booking(idBooking, dateCheckin, dateCheckout, dateBook, idCustommer);
		bookingService.insertBooking(booking);
		CheckinOut checkin = new CheckinOut(idBooking);
		checkinService.insertCheckinBooking(checkin);
		
		List<RoomType> listRoomType = (List<RoomType>) session.getAttribute("listRoomType");
		
		for (RoomType roomType : listRoomType) {
			String idDetailBooking = detailBookingService.setDeatailBookingID();
			String idroom = roomService.getIDRoomByIDRoomType(roomType.getIdRoomType(), dateCheckin, dateCheckout);
			DetailBooking detailBooking = new DetailBooking(idDetailBooking, idBooking, idroom, "1");
			detailBookingService.insertDeatailBooking(detailBooking);
		}
		String message = "Đặt phòng thành công!!!";
		mav.addObject("message", message);
		return mav;
	}
}
