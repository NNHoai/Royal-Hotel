package com.fa.mock.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fa.mock.Model.CustomerModel;
import com.fa.mock.Model.SignUpForm;
import com.fa.mock.Services.CustomerService;
import com.fa.mock.Services.SignUpService;

@Controller
public class SignUpController {
	@Autowired
	SignUpService signUpService;

	@Autowired
	CustomerService customerService;

	@GetMapping(value = "/dang-ky")
	public ModelAndView HomeController() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}

	@PostMapping(value = "/dang-ky")
	public ModelAndView pHomeController(HttpServletRequest request) {
		String message = "";
		ModelAndView mav = new ModelAndView("login");
		SignUpForm seOfAccount = new SignUpForm();
		List<SignUpForm> ls = signUpService.checkUser(request.getParameter("username"));
		if (ls.isEmpty()) {
			seOfAccount = new SignUpForm(request.getParameter("username"), request.getParameter("password"));
			System.out.println(request.getParameter("username"));
			signUpService.getDataSignUp(seOfAccount);
			String id = customerService.getIdCustommer();
			CustomerModel newCustomer = new CustomerModel(id, request.getParameter("name"),
					request.getParameter("phone"), request.getParameter("email"), request.getParameter("username"));
			customerService.insertCustomer(newCustomer);
			System.out.println(request.getParameter("username"));
			mav.addObject("signUpService", seOfAccount);
			message = "Đăng ký thành công!!!!";
		} else {
			message = "Tên tài khoản đã tồn tại!!!!";
			mav = new ModelAndView("register");
		}
		mav.addObject("message", message);
		return mav;
	}
}
