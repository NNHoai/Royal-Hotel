package com.fa.mock.Mapper.admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fa.mock.Model.admin.Bank;

public class MapperBank implements RowMapper<Bank>{
	

	public Bank mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bank ba = new Bank();
		
		ba.setId(rs.getInt("IDTypePay"));
		ba.setPayname(rs.getString("PayName"));
		ba.setDescription(rs.getString("Description"));
		return ba;
	}
	
}
