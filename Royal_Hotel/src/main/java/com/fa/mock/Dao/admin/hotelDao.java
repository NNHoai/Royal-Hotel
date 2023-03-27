package com.fa.mock.Dao.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Mapper.admin.MapperHotel;
import com.fa.mock.Mapper.admin.MapperService;
import com.fa.mock.Model.admin.HotelManage;
import com.fa.mock.Model.admin.serviceOfHotel;

@Repository
public class hotelDao {
	@Autowired
	JdbcTemplate _jdbctemplate;

	public List<HotelManage> getDataHotelManage() {
		List<HotelManage> list = new ArrayList<HotelManage>();
		String sql = "Select TOP (1) * from HOTEL";
		list = _jdbctemplate.query(sql, new MapperHotel());
		return list;
	}

	public int updateInfoHotel(HotelManage hotelManage) {
		String sql = "update HOTEL set NameHotel = N'" + hotelManage.getNameHotel() + "' , Address= N'"
				+ hotelManage.getAddressHotel() + "', Phone='" + hotelManage.getPhoneHotel() + "', Email='"
				+ hotelManage.getEmailHotel() + "', Fax='" + hotelManage.getFaxHotel() + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public List<serviceOfHotel> getDataservice() {
		List<serviceOfHotel> list = new ArrayList<serviceOfHotel>();
		String sql = "Select * from SERVICES";
		list = _jdbctemplate.query(sql, new MapperService());
		return list;
	}
	public int createService(serviceOfHotel seOfHotel) {
		String sql = "INSERT INTO SERVICES VALUES ('"+ seOfHotel.getIDServices() + "','" + seOfHotel.getNameServices() + "','" + seOfHotel.getPrice()+ "', '" + seOfHotel.getDescription() + "')";
		int n = _jdbctemplate.update(sql);
		return n;
	}

}
