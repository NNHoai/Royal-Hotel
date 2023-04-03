package com.fa.mock.Dao.web;

import java.time.LocalDate;
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
	public List<RoomType> searchRoomTypes(LocalDate dateCheckin, LocalDate dateCheckout) {
		List<RoomType> list = new ArrayList<>();
		String sql = "SELECT rt.* FROM ROOMTYPE rt "
				+ "WHERE NOT EXISTS ( SELECT 1 FROM ROOM r JOIN BOOKINGDETAIL bd ON bd.IDRoom = r.IDRoom "
				+ " JOIN BOOKING b ON b.IDBooking = bd.IDBooking "
				+ " WHERE b.DateCheckin >= '"+ dateCheckout +"'"
				+ " AND b.DateCheckout <= '"+ dateCheckin +"'"
				+ " AND rt.IDRoomType = r.IDRoomType )";
		
		list = _jdbcTemplate.query(sql, new MapperRoomType());
		return list;
	}
	public RoomType getRoomTypeById(String id) {
		RoomType roomtype = new RoomType();
		List<RoomType> list = new ArrayList<>();
		String sql = "SELECT * FROM ROOMTYPE WHERE IDRoomType = '"+id+"'";
		
		list = _jdbcTemplate.query(sql, new MapperRoomType());
		roomtype = list.get(0);
		return roomtype;
	}

}
