package com.fa.mock.Services.admin;

import java.util.List;

import com.fa.mock.Model.admin.Employee;
//import com.fa.mock.Model.admin.PriceByTime;

public interface EmployeeService {
	public List<Employee> getDataEmp();
	public int insertEmployee(Employee emp);
	public int updateEmployee(Employee emp);
	public Employee getEmployeeID(String id);
}
