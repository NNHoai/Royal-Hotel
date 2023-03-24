package com.fa.mock.Mapper.admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fa.mock.Model.admin.HotelManage;

public class MapperHotel implements RowMapper<HotelManage> {

	@Override
	public HotelManage mapRow(ResultSet rs, int rowNum) throws SQLException {
		HotelManage ht= new HotelManage();
		ht.setNameHotel(rs.getString("NameHotel"));
		ht.setAddressHotel(rs.getString("Address"));
		ht.setPhoneHotel(rs.getString("Phone"));
		ht.setEmailHotel(rs.getString("Email"));
		ht.setFaxHotel(rs.getString("Fax"));
		return ht;
	}

}
	