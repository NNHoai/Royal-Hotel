package com.fa.mock.Mapper.admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fa.mock.Model.admin.serviceOfHotel;

public class MapperService implements RowMapper<serviceOfHotel> {

	@Override
	public serviceOfHotel mapRow(ResultSet rs, int rowNum) throws SQLException {
		serviceOfHotel sh = new serviceOfHotel();
		sh.setIDServices(rs.getString("IDServices"));
		sh.setNameServices(rs.getString("NameServices"));
		sh.setPrice(rs.getFloat("Price"));
		sh.setDescription(rs.getString("Description"));
		return sh;
	}

}
