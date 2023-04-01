package com.fa.mock.Services.admin;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fa.mock.Model.admin.HotelManage;

@Service
public interface HotelService {
	public List<HotelManage> getDataHotel();
	public int updateInfoHotel(HotelManage hotelManage);
}
