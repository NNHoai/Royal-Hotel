package com.fa.mock.Services.admin;

import java.util.List;

import com.fa.mock.Model.admin.serviceOfHotel;

public interface CreateService {
	public List<serviceOfHotel> getDataService();
	public int CreateService(serviceOfHotel sOfHotel);

}
