package com.fa.mock.Controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fa.mock.Model.web.RoomType;
import com.fa.mock.Services.web.RoomTypeService;

@Controller
public class HomeController {
	
	@Autowired
	RoomTypeService roomTypeService;
	
	
	@GetMapping(value="/trang-chu")
	public ModelAndView HomeController() {
		ModelAndView mav = new ModelAndView("web/home");
		List<RoomType> list = roomTypeService.getDataRoomType();
		mav.addObject("roomtypelist", list);
		return mav;
	}
	@GetMapping(value="/loai-phong")
	public ModelAndView RoomTypeController() {
		ModelAndView mav = new ModelAndView("web/SearchBooking");
		List<RoomType> list = roomTypeService.getDataRoomType();
		mav.addObject("roomtypelist", list);
		return mav;
	}
}
