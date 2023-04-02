package com.fa.mock.Controller.employee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.fa.mock.Services.employee.CheckinService;


@Controller(value="controllerOfEmployee")
public class HomeController {
	@Autowired
	CheckinService checkinService;
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView employeePage() {
		ModelAndView mav = new ModelAndView(new RedirectView("dang-nhap"));
//		ModelAndView mav = new ModelAndView("employee/home");
//		mav.addObject("ListCheckin",checkinService.getDataCheckin());
		return mav;
	}
	
	@RequestMapping(value = "/employee/home", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("employee/home");
		mav.addObject("ListCheckin",checkinService.getDataCheckin());
		return mav;
	}
	
	@RequestMapping(value = "/employee/checkin{idBooking,idRoom}", method = RequestMethod.GET)
	public ModelAndView checkin(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("employee/home");
		String idBooking = request.getParameter("idBooking");
		String idRoom = request.getParameter("idRoom");
		String timeCheckin = (LocalDateTime.now()).format(DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss"));
		checkinService.updateCheckin(idBooking, idRoom, timeCheckin);
		mav.addObject("ListCheckin",checkinService.getDataCheckin());
		return mav;
	}
	
	@RequestMapping(value = "/employee/checkout{idBooking,idRoom}", method = RequestMethod.GET)
	public ModelAndView checkout(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("employee/home");
		String idBooking = request.getParameter("idBooking");
		String idRoom = request.getParameter("idRoom");
		String timeCheckout = (LocalDateTime.now()).format(DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss"));
		checkinService.updateCheckout(idBooking, idRoom, timeCheckout);
		mav.addObject("ListCheckin",checkinService.getDataCheckin());
		return mav;
	}
	
	
}
