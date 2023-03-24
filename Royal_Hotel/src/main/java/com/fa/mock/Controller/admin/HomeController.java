package com.fa.mock.Controller.admin;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fa.mock.Model.admin.HotelManage;
import com.fa.mock.Services.admin.HotelService;


@Controller(value = "homeControllerOfAdmin")
public class HomeController {
	@Autowired
	HotelService hotelService;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/home");
		mav.addObject("HotelManage",hotelService.getDataHotel());
		return mav;
	}
	//fix
	@RequestMapping(value = "/admin/save", method = RequestMethod.POST)
	public ModelAndView updateInfoHotel(HttpServletRequest req) {
		HotelManage hotelManage = new HotelManage(req.getParameter("nameHotel"),req.getParameter("addressHotel"),req.getParameter("phoneHotel"),req.getParameter("emailHotel"), req.getParameter("faxHotel"));
		ModelAndView mav = new ModelAndView("admin/home");;
		hotelService.updateInfoHotel(hotelManage);
		mav.addObject("HotelManage",hotelService.getDataHotel());
		return mav;
	}
}
