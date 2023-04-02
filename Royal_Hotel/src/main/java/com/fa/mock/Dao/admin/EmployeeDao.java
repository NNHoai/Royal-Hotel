package com.fa.mock.Dao.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Mapper.admin.MapperBank;
import com.fa.mock.Mapper.admin.MapperEmployee;
import com.fa.mock.Mapper.admin.MapperPrice;
import com.fa.mock.Model.admin.Bank;
import com.fa.mock.Model.admin.Employee;
import com.fa.mock.Model.admin.PriceByTime;

@Repository
public class EmployeeDao {
	@Autowired
	JdbcTemplate _jdbctemplate;

	public List<Employee> getDataEmp() {
		List<Employee> list = new ArrayList<Employee>();
		String sql = "SELECT* FROM EMPLOYEE";
		list = _jdbctemplate.query(sql, new MapperEmployee());
		return list;
	}

	public int insertEmployee(Employee emp) {
		String sql = "INSERT INTO EMPLOYEE VALUES ('" + emp.getId() + "','" + emp.getFullname() + "','"
				+ emp.getGender() + "','" + emp.getBirthday() + "','" + emp.getAddress() + "','" + emp.getPhone() +"','" + emp.getEmail() +"','" + emp.getCitizenID() +"','" + emp.getUserName() +"')";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public int updateEmployee(Employee emp) {
		String sql = "UPDATE EMPLOYEE SET IDEmployee ='" + emp.getId() + "', FullName='" + emp.getFullname()
				+ "', Gender='" + emp.getGender() +  "', Birthday='" + emp.getBirthday() + "',Address='" + emp.getAddress() + "', Phone='" + emp.getPhone() + "', Email='" + emp.getEmail() +"', CitizenID='" + emp.getCitizenID()+"', UserName='" + emp.getUserName()+"' WHERE IDEmployee = '" + emp.getId() + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public Employee getEmployeeID(String id) {
		List<Employee> list = new ArrayList<Employee>();
		String sql = "SELECT* FROM EMPLOYEE WHERE IDEmployee = '" + id + "'";
		list = _jdbctemplate.query(sql, new MapperEmployee());
		Employee em = list.get(0);
		return em;
	}

	
}
