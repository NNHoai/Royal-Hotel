package com.fa.mock.Dao.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Model.web.DetailBooking;

@Repository
public class DetailBookingDao {
	@Autowired
	JdbcTemplate _jdbcTemplate;
	
	public int insertDetailBooking(DetailBooking detailBooking) {
		String sql = "INSERT INTO BOOKINGDETAIL VALUES ('" + detailBooking.getIDBookingDetail() + "','" + detailBooking.getIDBooking() + "','"
				+ detailBooking.getIDRoom() + "','" + detailBooking.getQuantityRoom()  +"')";
		int n = _jdbcTemplate.update(sql);
		return n;
	}
	
	public String setDetailBookingnID() {
		String sql = "SELECT COUNT(*) FROM BOOKINGDETAIL";
		int n = _jdbcTemplate.queryForObject(sql, Integer.class);
		String id = "DB"+n;
		return id;
	}
}
