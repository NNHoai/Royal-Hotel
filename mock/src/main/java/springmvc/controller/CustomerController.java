package springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.CustomerModel;
import springmvc.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping(value="/profile")
	public ModelAndView CustomerController() {
		ModelAndView mav = new ModelAndView("web/updateProfile");
		List<CustomerModel> list = customerService.getDataCustomer();
		mav.addObject("customerService", list);
		return mav;
	}
	
	@PostMapping(value = "/profile")
	public ModelAndView pCustomerController(HttpServletRequest request, HttpSession session) {
		ModelAndView mav = new ModelAndView("web/updateProfile");
		CustomerModel customer = new CustomerModel();
		customer.setFullName(request.getParameter("name"));
		customer.setUserName(request.getParameter("username"));
		customer.setGender(Byte.parseByte(request.getParameter("gender")));
		customer.setBirthday(request.getParameter("birthday"));
		customer.setAddress(request.getParameter("address"));
		customer.setPhone(request.getParameter("phone"));
		customer.setEmail(request.getParameter("email"));
		customer.setCitizenID(request.getParameter("citizenID"));
		customerService.updateInfoCustomer(customer);
		System.out.println(customer.toString());
		session.setAttribute("custommer", customer);
		List<CustomerModel> list = customerService.getDataCustomer();
		mav.addObject("customerService", list);
		return mav;
	}
}
