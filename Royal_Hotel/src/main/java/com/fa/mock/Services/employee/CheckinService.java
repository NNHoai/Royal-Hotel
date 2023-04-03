package com.fa.mock.Services.employee;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fa.mock.Model.employee.CheckinOut;
@Service
public interface CheckinService {
	public List<CheckinOut> getDataCheckin();
	public int insertCheckin(CheckinOut checkinOut);
//	public int insertCheckin(String idBookin, String idRoom);
	public int updateCheckin(String idBookin, String idRoom, String timeCheckin);
	public int updateCheckout(String idBooking, String idRoom, String timeCheckout);
}
