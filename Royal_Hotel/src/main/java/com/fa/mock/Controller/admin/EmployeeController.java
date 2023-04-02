package com.fa.mock.Controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fa.mock.Model.admin.Employee;
//import com.fa.mock.Model.admin.PriceByTime;
import com.fa.mock.Services.admin.EmployeeService;

@Controller(value = "homeControllerOfEmp")

public class EmployeeController {
	@Autowired
	EmployeeService emp;
	
	@RequestMapping(value = "/admin/employee", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/listEmployee");
		mav.addObject("Employee",emp.getDataEmp());
		return mav;
	}
	
	@RequestMapping(value = "/admin/newemployee", method = RequestMethod.POST)
	public ModelAndView insertEmployee(HttpServletRequest req) {
		Employee em = new Employee(req.getParameter("id"),req.getParameter("fullname"),req.getParameter("gender"),req.getParameter("brithday"),req.getParameter("address"),req.getParameter("phone"),req.getParameter("email"),req.getParameter("citizenID"),req.getParameter("username"));
		ModelAndView mav = new ModelAndView("admin/listEmployee");;
		emp.insertEmployee(em);
		mav.addObject("Employee",emp.getDataEmp());
		return mav;
	}
	@RequestMapping(value = "/admin/editemployee", method = RequestMethod.GET)
	public ModelAndView getUpdateEmployee(HttpServletRequest req) {
		String id = req.getParameter("id");
		Employee em = emp.getEmployeeID(id);
		ModelAndView mav = new ModelAndView("admin/editEmployee");
		mav.addObject("Employee",em);
		return mav;
	}
	@RequestMapping(value = "/admin/editemployee", method = RequestMethod.POST)
	public ModelAndView updateEmployee(HttpServletRequest req) {
		Employee em = new Employee(req.getParameter("id"),req.getParameter("fullname"),req.getParameter("gender"),req.getParameter("brithday"),req.getParameter("address"),req.getParameter("phone"),req.getParameter("email"),req.getParameter("citizenID"),req.getParameter("username"));
		ModelAndView mav = new ModelAndView("admin/listEmployee");
		emp.updateEmployee(em);
		mav.addObject("Employee", emp.getDataEmp());	
		return mav;
	}
}
