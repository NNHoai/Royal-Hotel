package com.fa.mock.Dao.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Mapper.web.MapperRoomType;
import com.fa.mock.Model.web.RoomType;

@Repository
public class RoomTypeDao {
	
	@Autowired
	JdbcTemplate _jdbcTemplate;
	public List<RoomType> getDataRoomType() {
		List<RoomType> list = new ArrayList<>();
		String sql = "SELECT * FROM ROOMTYPE";
		list = _jdbcTemplate.query(sql, new MapperRoomType());
		return list;
	}

}
