package springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.CustomerModel;
import springmvc.model.SignUpForm;
import springmvc.service.CustomerService;
import springmvc.service.SignUpService;

@Controller
public class SignUpController {
	@Autowired
	SignUpService signUpService;

	@Autowired
	CustomerService customerService;

	@GetMapping(value = "/dang-ky")
	public ModelAndView HomeController() {
		ModelAndView mav = new ModelAndView("register/register");
		return mav;
	}

	@GetMapping(value = "/dang-nhap")
	public ModelAndView gHomeController(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("login/login");
		return mav;
	}

	@PostMapping(value = "/dang-nhap")
	public ModelAndView pHomeController(HttpServletRequest request) {
		String message = "";
		ModelAndView mav = new ModelAndView("login/login");
		SignUpForm seOfAccount = new SignUpForm();
		List<SignUpForm> ls = signUpService.checkUser(request.getParameter("username"));
		if (ls.isEmpty()) {
			seOfAccount = new SignUpForm(request.getParameter("username"), request.getParameter("password"));
			signUpService.getDataSignUp(seOfAccount);
			String id = customerService.getIdCustommer();
			CustomerModel newCustomer = new CustomerModel(id, request.getParameter("name"),
					request.getParameter("phone"), request.getParameter("email"), request.getParameter("username"));
			customerService.insertCustomer(newCustomer);
			mav.addObject("signUpService", seOfAccount);
			message = "Đăng ký thành công!!!!";
		} else {
			message = "Tên tài khoản đã tồn tại!!!!";
			mav = new ModelAndView("register/register");
		}
		mav.addObject("message", message);
		return mav;
	}
}
