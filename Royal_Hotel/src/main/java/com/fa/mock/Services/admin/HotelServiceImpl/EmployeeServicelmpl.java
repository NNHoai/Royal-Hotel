package com.fa.mock.Services.admin.HotelServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.mock.Dao.admin.EmployeeDao;
import com.fa.mock.Model.admin.Employee;
import com.fa.mock.Services.admin.EmployeeService;

@Service
public class EmployeeServicelmpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	@Override
	public List<Employee> getDataEmp() {
		return employeeDao.getDataEmp();
	}
	public int insertEmployee(Employee emp) {
		return employeeDao.insertEmployee(emp);
	}
	@Override
	public int updateEmployee(Employee emp) {

		return employeeDao.updateEmployee(emp);
	}
	@Override
	public Employee getEmployeeID(String id) {
		return employeeDao.getEmployeeID(id);
	}

}
