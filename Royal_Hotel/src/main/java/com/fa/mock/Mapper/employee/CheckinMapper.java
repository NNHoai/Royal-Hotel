package com.fa.mock.Mapper.employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fa.mock.Model.admin.HotelManage;
import com.fa.mock.Model.employee.CheckinOut;

public class CheckinMapper implements RowMapper<CheckinOut>{

	@Override
	public CheckinOut mapRow(ResultSet rs, int rowNum) throws SQLException {
		CheckinOut ck= new CheckinOut();
		ck.setIdBooking(rs.getString("IDBooking"));
		ck.setIdRoom(rs.getString("IDRoom"));
		ck.setNameRoom(rs.getString("NameRoom"));
		ck.setNameCustomer(rs.getString("FullName"));
		ck.setTimeCheckin(rs.getString("TimeCheckin"));
		ck.setTimeCheckout(rs.getString("TimeCheckout"));
		return ck;
	}
	
}
