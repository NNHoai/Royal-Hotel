package com.fa.mock.Controller.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping(value="/trang-chu")
	public ModelAndView homeController(HttpSession session) {
		ModelAndView mav = new ModelAndView("web/home");
		String usename = "Admin";
		session.setAttribute("Username", usename);
		return mav;
	}
}
