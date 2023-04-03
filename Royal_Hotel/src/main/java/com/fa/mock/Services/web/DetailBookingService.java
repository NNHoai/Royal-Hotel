package com.fa.mock.Services.web;

import org.springframework.stereotype.Service;

import com.fa.mock.Model.web.DetailBooking;

@Service
public interface DetailBookingService {
	int insertDeatailBooking(DetailBooking detaiBbooking);
	String setDeatailBookingID();
}
