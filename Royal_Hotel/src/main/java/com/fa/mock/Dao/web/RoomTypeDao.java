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
		String sql = "SELECT r.IDRoomType, r.NameRoomType, r.Description, (r.Price*(1+p.Percents/100)) AS Price FROM ROOMTYPE r JOIN PRICEBYTIME p ON r.IDPriceByTime = p.IDPriceByTime";
		list = _jdbcTemplate.query(sql, new MapperRoomType());
		return list;
	}

}
