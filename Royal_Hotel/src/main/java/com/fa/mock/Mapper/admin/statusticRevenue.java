package com.fa.mock.Mapper.admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fa.mock.Model.admin.statustic;

public class statusticRevenue implements RowMapper<statustic>{

	@Override
	public statustic mapRow(ResultSet rs, int rowNum) throws SQLException {
		statustic sta = new statustic();
		sta.setDateBill(rs.getString("DateBill"));
		sta.setTotalPrice(rs.getFloat("TotalPrice"));
		return sta;
	}

}
