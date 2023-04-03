package com.fa.mock.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {

	@GetMapping(value = "/dang-xuat")
	public ModelAndView gHomeController(HttpSession session) {
		ModelAndView mav = new ModelAndView("web/home");
		session.removeAttribute("custommer");
		session.removeAttribute("dateCheckin");
		session.removeAttribute("dateCheckout");
		session.removeAttribute("listRoomType");
		return mav;
	}
}	