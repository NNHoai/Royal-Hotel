package com.fa.mock.Controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.fa.mock.Model.admin.Bank;
import com.fa.mock.Model.admin.PriceByTime;
import com.fa.mock.Model.admin.Room;
import com.fa.mock.Services.admin.BankService;



@Controller(value ="controllerOfBank")
public class BankController {

	@Autowired
	BankService BankService;
	
	

	@RequestMapping(value = "/admin/bank", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/listBank");
		mav.addObject("Bank", BankService.getDataBank());	
		return mav;
	}
	@RequestMapping(value = "/admin/newbank", method = RequestMethod.POST)
	public ModelAndView insertBank(HttpServletRequest req) {
		Bank ba = new Bank(Integer.parseInt(req.getParameter("id")),req.getParameter("payname"),req.getParameter("description"));
		ModelAndView mav = new ModelAndView("admin/listBank");;
		BankService.insertBank(ba);
		mav.addObject("Bank",BankService.getDataBank());
		return mav;
	}
	@RequestMapping(value = "/admin/editBank", method = RequestMethod.GET)
	public ModelAndView getUpdateInfoHotel(HttpServletRequest req) {
		String id = req.getParameter("id");
		Bank rm = BankService.getBankByID(id);
		ModelAndView mav = new ModelAndView("admin/editBank");
		mav.addObject("Bank",rm);
		return mav;
	}
	@RequestMapping(value = "/admin/editBank", method = RequestMethod.POST)
	public ModelAndView updateInfoHotel(HttpServletRequest req) {
		Bank rm = new Bank(Integer.parseInt(req.getParameter("id")),req.getParameter("payname"),req.getParameter("description"));
		ModelAndView mav = new ModelAndView("admin/listBank");
		BankService.updateBank(rm);
		mav.addObject("Bank", BankService.getDataBank());	
		return mav;
	}
//	@RequestMapping(value = "/admin/edit", method = RequestMethod.GET)
//	public ModelAndView getUpdateInfoHotel(HttpServletRequest req) {
//		String id = req.getParameter("id");
//		Room rm = RoomService.getRoomByID(id);
//		ModelAndView mav = new ModelAndView("admin/from");
//		mav.addObject("room",rm);
//		return mav;
//	}
//	@RequestMapping(value = "/admin/edit", method = RequestMethod.POST)
//	public ModelAndView updateInfoHotel(HttpServletRequest req) {
//		Room rm = new Room(req.getParameter("id"),req.getParameter("NameRoom"),req.getParameter("status"),req.getParameter("optradio"));
//		ModelAndView mav = new ModelAndView("admin/listRoom");
//		RoomService.updateRoom(rm);
//		mav.addObject("Room", RoomService.getDataRoom());	
//		return mav;
//	}
//	
//	@RequestMapping(value = "/admin/add", method = RequestMethod.POST)
//	public ModelAndView insertRoom(HttpServletRequest req) {
//		Room rm = new Room(req.getParameter("id"),req.getParameter("NameRoom"),null,req.getParameter("optradio"));
//		ModelAndView mav = new ModelAndView("admin/listRoom");;
//		RoomService.insertRoom(rm);
//		mav.addObject("Room",RoomService.getDataRoom());
//		return mav;
//	}


}
