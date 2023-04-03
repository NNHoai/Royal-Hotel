package com.fa.mock.Services.employee;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.mock.Dao.employee.CheckinOutDao;
import com.fa.mock.Model.employee.CheckinOut;
@Service
public class CheckinServiceImpl implements CheckinService{
	@Autowired
	CheckinOutDao checkinOutDao;
	
	@Override
	public List<CheckinOut> getDataCheckin() {
	
		return checkinOutDao.getDataCheckin();
	}

	@Override
	public int updateCheckin(String idBooking, String idRoom, String timeCheckin) {
		return checkinOutDao.updateCheckin(idBooking,idRoom, timeCheckin);
	}

	@Override
	public int updateCheckout(String idBooking, String idRoom, String timeCheckout) {
		return checkinOutDao.updateCheckout(idBooking,idRoom, timeCheckout);
	}

	@Override
	public int insertCheckin(CheckinOut checkinOut) {
		return checkinOutDao.insertCheckin(checkinOut);
	}

//	@Override
//	public int insertCheckin(String idBookin, String idRoom) {
//		return checkinOutDao.insertCheckin(idBookin, idRoom);
//	}

}
