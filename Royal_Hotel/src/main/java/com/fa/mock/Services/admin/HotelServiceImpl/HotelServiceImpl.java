package com.fa.mock.Services.admin.HotelServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.mock.Dao.admin.hotelDao;
import com.fa.mock.Model.admin.HotelManage;
import com.fa.mock.Services.admin.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	@Autowired
	hotelDao hoteldao;

	@Override
	public List<HotelManage> getDataHotel() {
		return hoteldao.getDataHotelManage();
	}
	
	
}
