package com.fa.mock.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.fa.mock.Dao.CustomerDao;
import com.fa.mock.Dao.LoginDao;
import com.fa.mock.Model.CustomerModel;

@Controller
public class LoginController {

	@Autowired
	LoginDao loginDao;

	@Autowired
	CustomerDao customerDao;

	@GetMapping(value = "/dang-nhap")
	public ModelAndView gHomeController(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@PostMapping("/dang-nhap")
	public ModelAndView checkUser(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session) {
		int check = loginDao.checkExistsUser(username);
		boolean loginFlag = loginDao.validateUser(username, password);
		ModelAndView mav = null;

		if (check == 1) {
			int role = loginDao.getRole(username);
			if (loginFlag == true && role == 1) {
				CustomerModel cus = customerDao.getCustomer(username);
				session.setAttribute("custommer", cus);
				mav = new ModelAndView(new RedirectView("trang-chu"));
			} else if (loginFlag == true && role == 0) {
				mav = new ModelAndView(new RedirectView("admin/home"));
				session.setAttribute("username", username);
			} else if (loginFlag == true && role == 2) {
				mav = new ModelAndView(new RedirectView("employee/home"));
				session.setAttribute("username", username);
			} else {
				mav = new ModelAndView("login");
				String message = "sai tk";
				mav.addObject("message", message);
			}
		}
		else {
			mav = new ModelAndView("login");
			String message = "Username không tồn tại!!!";
			mav.addObject("message", message);
		}
		return mav;
	}
}
