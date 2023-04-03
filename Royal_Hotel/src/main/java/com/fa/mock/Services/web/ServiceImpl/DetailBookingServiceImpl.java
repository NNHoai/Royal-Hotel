package com.fa.mock.Services.web.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.mock.Dao.web.DetailBookingDao;
import com.fa.mock.Model.web.DetailBooking;
import com.fa.mock.Services.web.DetailBookingService;

@Service
public class DetailBookingServiceImpl implements DetailBookingService{
	@Autowired
	DetailBookingDao detailBookingDao;
	
	@Override
	public int insertDeatailBooking(DetailBooking detaiBbooking) {
		return detailBookingDao.insertDetailBooking(detaiBbooking);
	}

	@Override
	public String setDeatailBookingID() {
		return detailBookingDao.setDetailBookingnID();
	}
	
}
