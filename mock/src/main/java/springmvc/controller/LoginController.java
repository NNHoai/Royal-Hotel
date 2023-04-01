package springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.dao.CustomerDao;
import springmvc.dao.LoginDao;
import springmvc.model.CustomerModel;

@Controller
public class LoginController {

	@Autowired
	LoginDao loginDao;

	@Autowired
	CustomerDao customerDao;

	@PostMapping("/trang-chu")
	public ModelAndView checkUser(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session) {
		int check = loginDao.checkExistsUser(username);
		boolean loginFlag = loginDao.validateUser(username, password);
		ModelAndView mav = null;

		if (check == 1) {
			int role = loginDao.getRole(username);
			CustomerModel cus = customerDao.getCustomer(username);
			session.setAttribute("custommer", cus);
			if (loginFlag == true && role == 1) {
				mav = new ModelAndView("user");
			} else if (loginFlag == true && role == 0) {
				mav = new ModelAndView("admin");
			} else if (loginFlag == true && role == 2) {
				mav = new ModelAndView("employee");
			} else {
				mav = new ModelAndView("login/login");
				String message = "sai tk";
				mav.addObject("message", message);
			}
		}
		else {
			mav = new ModelAndView("login/login");
			String message = "Username không tồn tại!!!";
			mav.addObject("message", message);
		}
		return mav;
	}
}
