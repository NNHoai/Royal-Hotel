package com.fa.mock.Services.web.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.mock.Dao.web.RoomTypeDao;
import com.fa.mock.Model.web.RoomType;
import com.fa.mock.Services.web.RoomTypeService;

@Service
public class RoomTypeServiceImpl implements RoomTypeService{
	
	@Autowired
	RoomTypeDao roomTypeDao;
	@Override
	public List<RoomType> getDataRoomType() {
		return roomTypeDao.getDataRoomType();
	}

}
