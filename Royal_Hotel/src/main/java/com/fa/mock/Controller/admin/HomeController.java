package com.fa.mock.Controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fa.mock.Model.admin.HotelManage;
import com.fa.mock.Model.admin.serviceOfHotel;
import com.fa.mock.Services.admin.CreateService;
import com.fa.mock.Services.admin.HotelService;

@Controller(value = "homeControllerOfAdmin")
public class HomeController {
	@Autowired
	HotelService hotelService;
	
	@Autowired
	CreateService createService;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/home");
		mav.addObject("HotelManage", hotelService.getDataHotel());
		return mav;
	}
	@RequestMapping(value = "/admin/home", method = RequestMethod.GET)
	public ModelAndView infoHotel() {
		ModelAndView mav = new ModelAndView("admin/home");
		mav.addObject("HotelManage", hotelService.getDataHotel());
		return mav;
	}	
	@RequestMapping(value = "/admin/save", method = RequestMethod.POST)
	public ModelAndView updateInfoHotel(HttpServletRequest req) {
		HotelManage hotelManage = new HotelManage(req.getParameter("nameHotel"), req.getParameter("addressHotel"),
				req.getParameter("phoneHotel"), req.getParameter("emailHotel"), req.getParameter("faxHotel"));
		ModelAndView mav = new ModelAndView("admin/home");
		hotelService.updateInfoHotel(hotelManage);
		mav.addObject("HotelManage", hotelService.getDataHotel());
		return mav;
	}

	@RequestMapping(value = "/admin/editservice", method = RequestMethod.GET)
	public ModelAndView getUpdateService(HttpServletRequest req) {
		String id = req.getParameter("id");
		serviceOfHotel se = createService.getServiceByID(id);
		ModelAndView mav = new ModelAndView("admin/updateService");
		mav.addObject("service",se);	
		return mav;
	}
	@RequestMapping(value = "/admin/editservice", method = RequestMethod.POST)
	public ModelAndView updateService(HttpServletRequest req) {
		serviceOfHotel rm = new serviceOfHotel(req.getParameter("ID"),req.getParameter("nameService"),Float.parseFloat(req.getParameter("priceService")),req.getParameter("Description"));
		ModelAndView mav = new ModelAndView("admin/Infoservice");
		createService.updateService(rm);
		mav.addObject("serviceOfHotel", createService.getDataService());	
		return mav;
	}

	@RequestMapping(value = "/admin/Infoservice", method = RequestMethod.GET)
	public ModelAndView ServiveHotel() {
		ModelAndView mav = new ModelAndView("admin/Infoservice");
		mav.addObject("serviceOfHotel", createService.getDataService());
		return mav;
	}

	@RequestMapping(value = "/admin/Create", method = RequestMethod.POST)
	public ModelAndView createInfoHotel(HttpServletRequest req) {
		serviceOfHotel ofHotel = new serviceOfHotel(req.getParameter("ID"), req.getParameter("nameService"),
				Float.parseFloat(req.getParameter("priceService")), req.getParameter("Description"));
		ModelAndView mav = new ModelAndView("admin/Infoservice");
		createService.CreateService(ofHotel);
		mav.addObject("serviceOfHotel", createService.getDataService());
		return mav;
	}
	
	
	
	@RequestMapping(value = "/admin/deleteservice", method = RequestMethod.POST)
	public ModelAndView deleteService(HttpServletRequest req) {
		String delete = req.getParameter("id");
		serviceOfHotel se = createService.getServiceByID(delete);
		ModelAndView mav = new ModelAndView("admin/Infoservice");
		createService.deleteService(se);
		mav.addObject("serviceOfHotel", createService.getDataService());	
		return mav;
	}
}
