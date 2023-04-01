package com.fa.mock.Mapper.admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fa.mock.Model.admin.PriceByTime;


public class MapperPrice implements RowMapper<PriceByTime> {

	@Override
	public PriceByTime mapRow(ResultSet rs, int rowNum) throws SQLException {
		PriceByTime pt= new PriceByTime();
		
		pt.setId(rs.getString("IDPriceByTime"));
		pt.setReason(rs.getString("Reason"));
		pt.setPersent(rs.getFloat("Percents"));
		pt. setDateFrom(rs.getString("DateFrom"));
		pt. setDateTo(rs.getString("DateTo"));
		return pt;
	}

	
}
