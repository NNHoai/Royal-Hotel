package com.fa.mock.Dao.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Mapper.admin.MapperHotel;
import com.fa.mock.Model.admin.HotelManage;

@Repository
public class hotelDao {
	@Autowired
	JdbcTemplate _jdbctemplate;
	
	public List<HotelManage> getDataHotelManage(){
		List<HotelManage> list = new ArrayList<HotelManage>();
		String sql= "Select TOP (1) * from HOTEL";
		list = _jdbctemplate.query(sql, new MapperHotel());
		return list;
	}

}
