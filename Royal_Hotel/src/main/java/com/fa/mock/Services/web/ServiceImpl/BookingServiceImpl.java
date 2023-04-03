package com.fa.mock.Services.web.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.mock.Dao.web.BookingDao;
import com.fa.mock.Model.web.Booking;
import com.fa.mock.Services.web.BookingService;

@Service
public class BookingServiceImpl implements BookingService{
	@Autowired 
	BookingDao bookingDao;
	
	@Override
	public int insertBooking(Booking booking) {
		return bookingDao.insertBooking(booking);
	}

	@Override
	public String setBookingID() {
		return bookingDao.setBookingID();
	}

}
