package com.fa.mock.Services.admin;

import java.util.List;

import com.fa.mock.Model.admin.HotelManage;


public interface HotelService {
	public List<HotelManage> getDataHotel();
	public int updateInfoHotel(HotelManage hotelManage);
}
