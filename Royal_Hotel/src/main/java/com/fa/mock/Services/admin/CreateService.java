package com.fa.mock.Services.admin;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fa.mock.Model.admin.serviceOfHotel;
@Service
public interface CreateService {
	public List<serviceOfHotel> getDataService();
	public int CreateService(serviceOfHotel sOfHotel);
	public int updateService(serviceOfHotel soHotel);
	public serviceOfHotel getServiceByID(String id);
	public int deleteService(serviceOfHotel soHotel);

}
