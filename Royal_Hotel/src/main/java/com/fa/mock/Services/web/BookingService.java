package com.fa.mock.Services.web;

import org.springframework.stereotype.Service;

import com.fa.mock.Model.web.Booking;

@Service
public interface BookingService {
	int insertBooking(Booking booking);
	String setBookingID();
}
