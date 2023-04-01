package com.fa.mock.Services.admin.HotelServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.mock.Dao.admin.hotelDao;
import com.fa.mock.Model.admin.serviceOfHotel;
import com.fa.mock.Services.admin.CreateService;

@Service
public class InfoService implements CreateService {

	@Autowired
	hotelDao hoteldao;
	@Override
	public List<serviceOfHotel> getDataService() {
		
		return hoteldao.getDataservice();
	}
	@Override
	public int CreateService(serviceOfHotel sOfHotel) {
		return hoteldao.createService(sOfHotel);
	}
	@Override
	public int updateService(serviceOfHotel soHotel) {
		return hoteldao.updateService(soHotel);
	}
	@Override
	public serviceOfHotel getServiceByID(String id) {
		return hoteldao.getServiceByID(id);
	}
	@Override
	public int deleteService(serviceOfHotel soHotel) {
		return hoteldao.deleteService(soHotel);
	}
	
	



}
