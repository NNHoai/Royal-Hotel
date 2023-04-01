package com.fa.mock.Controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fa.mock.Model.admin.PriceByTime;
import com.fa.mock.Model.admin.Room;
import com.fa.mock.Services.admin.RoomService;



@Controller(value ="controllerOfRoom")
public class RoomController {

	@Autowired
	RoomService RoomService;
	
	

	@RequestMapping(value = "/admin/room", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/listRoom");
		mav.addObject("Room", RoomService.getDataRoom());	
		return mav;
	}
	@RequestMapping(value = "/admin/edit", method = RequestMethod.GET)
	public ModelAndView getUpdateInfoHotel(HttpServletRequest req) {
		String id = req.getParameter("id");
		Room rm = RoomService.getRoomByID(id);
		ModelAndView mav = new ModelAndView("admin/from");
		mav.addObject("room",rm);
		return mav;
	}
	@RequestMapping(value = "/admin/edit", method = RequestMethod.POST)
	public ModelAndView updateInfoHotel(HttpServletRequest req) {
		Room rm = new Room(req.getParameter("id"),req.getParameter("NameRoom"),req.getParameter("status"),req.getParameter("optradio"));
		ModelAndView mav = new ModelAndView("admin/listRoom");
		RoomService.updateRoom(rm);
		mav.addObject("Room", RoomService.getDataRoom());	
		return mav;
	}
	
	@RequestMapping(value = "/admin/add", method = RequestMethod.POST)
	public ModelAndView insertRoom(HttpServletRequest req) {
		Room rm = new Room(req.getParameter("id"),req.getParameter("NameRoom"),null,req.getParameter("optradio"));
		ModelAndView mav = new ModelAndView("admin/listRoom");;
		RoomService.insertRoom(rm);
		mav.addObject("Room",RoomService.getDataRoom());
		return mav;
	}
	@RequestMapping(value = "/admin/deleteroom", method = RequestMethod.POST)
	public ModelAndView deletePrice(HttpServletRequest req) {
		String id = req.getParameter("id");
		Room pt = RoomService.getRoomByID(id);
		ModelAndView mav = new ModelAndView("admin/listRoom");
		RoomService.DeleteRoom(pt);
		mav.addObject("Room",RoomService.getDataRoom());	
		return mav;
	}
	@RequestMapping(value = "/admin/empty", method = RequestMethod.GET)
	public ModelAndView count() {
		ModelAndView mav = new ModelAndView("admin/empty");
		int num = RoomService.getRoomEmpty();
		int num1=RoomService.getCountRoom();
		int r1=RoomService.getCountR1();
		int r2=RoomService.getCountR2();
		int r3=RoomService.getCountR3();
		int r4=RoomService.getCountR4();
		int r5=RoomService.getCountR5();
		int r6=RoomService.getCountR6();
		int r7=RoomService.getCountR7();
		int s1=RoomService.getCountNR1();
		int s2=RoomService.getCountNR2();
		int s3=RoomService.getCountNR3();
		int s4=RoomService.getCountNR4();
		int s5=RoomService.getCountNR5();
		int s6=RoomService.getCountNR6();
		int s7=RoomService.getCountNR7();
		mav.addObject("numberRoom", num);
		mav.addObject("numberRoom1", num1);
		mav.addObject("R1", r1);
		mav.addObject("R2", r2);
		mav.addObject("R3", r3);
		mav.addObject("R4", r4);
		mav.addObject("R5", r5); 	
		mav.addObject("R6", r6);
		mav.addObject("R7", r7);
		mav.addObject("N1", s1);
		mav.addObject("N2", s2);
		mav.addObject("N3", s3);
		mav.addObject("N4", s4);
		mav.addObject("N5", s5);
		mav.addObject("N6", s6);
		mav.addObject("N7", s7);
		return mav;
	}


}
