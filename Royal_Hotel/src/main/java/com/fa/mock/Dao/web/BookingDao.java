package com.fa.mock.Dao.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Model.web.Booking;

@Repository
public class BookingDao {
	
	@Autowired
	JdbcTemplate _jdbcTemplate;
	
	public int insertBooking(Booking booking) {
		String sql = "INSERT INTO BOOKING VALUES ('" + booking.getIDBooking() + "','" + booking.getDateCheckin() + "','"
				+ booking.getDateCheckout() + "','" + booking.getDateBook() + "','" + booking.getIDCustomer() +"')";
		int n = _jdbcTemplate.update(sql);
		return n;
	}
	
	public String setBookingID() {
		String sql = "SELECT COUNT(*) FROM BOOKING";
		int n = _jdbcTemplate.queryForObject(sql, Integer.class);
		String id = "B"+n;
		return id;
	}

}
