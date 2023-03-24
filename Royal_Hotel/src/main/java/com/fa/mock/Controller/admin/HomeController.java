package com.fa.mock.Controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
}
