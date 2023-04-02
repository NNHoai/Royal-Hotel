package com.fa.mock.Mapper.admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fa.mock.Model.admin.Employee;

public class MapperEmployee implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee em= new Employee();
		em.setId(rs.getString("IDEmployee"));
		em.setFullname(rs.getString("FullName"));
		em.setGender(rs.getString("Gender"));
		em.setBirthday(rs.getString("Birthday"));
		em.setAddress(rs.getString("Address"));
		em.setPhone(rs.getString("Phone"));
		em.setEmail(rs.getString("Email"));
		em.setCitizenID(rs.getString("CitizenID"));
		em.setUserName(rs.getString("UserName"));
		return em;
		
	}

}
