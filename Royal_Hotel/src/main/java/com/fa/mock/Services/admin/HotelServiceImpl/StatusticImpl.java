package com.fa.mock.Services.admin.HotelServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.mock.Dao.admin.hotelDao;
import com.fa.mock.Model.admin.statustic;
import com.fa.mock.Services.admin.Statustic;

@Service
public class StatusticImpl implements Statustic{
	@Autowired
	hotelDao hoteldao;

	@Override
	public List<statustic> getStatustic() {
		return hoteldao.getStatustic();
	}

}
