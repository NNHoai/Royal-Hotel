package com.fa.mock.Services.admin.HotelServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.mock.Dao.admin.PriceDao;
import com.fa.mock.Model.admin.PriceByTime;
import com.fa.mock.Model.web.RoomType;
import com.fa.mock.Services.admin.PriceService;


@Service
public class PriceServiceImpl implements PriceService {

	@Autowired
	PriceDao pricedao;

	@Override
	public List<PriceByTime> getDataPrice() {
		// TODO Auto-generated method stub
		return pricedao.getDataPrice();
	}

	@Override
	public int insertPrice(PriceByTime price) {
		// TODO Auto-generated method stub
		return pricedao.insertPrice(price);
	}

	@Override
	public int updatePrice(PriceByTime price) {
		// TODO Auto-generated method stub
		return pricedao.updateprice(price);
	}

	@Override
	public PriceByTime getPriceByID(String id) {
		// TODO Auto-generated method stub
		return pricedao.getPriceByID(id);
	}

	@Override
	public int DeletePrice(PriceByTime price) {
		// TODO Auto-generated method stub
		return pricedao.DeletePrice(price);
	}

	@Override
	public List<RoomType> getDataRoomType() {
		// TODO Auto-generated method stub
		return pricedao.getDataRoomType();
	}

	@Override
	public List<RoomType> getDataRoomT() {
		// TODO Auto-generated method stub
		return pricedao.getDataRoomT();
	}

	@Override
	public int updateRoomtype(RoomType type) {
		// TODO Auto-generated method stub
		return pricedao.updateRoomtype(type);
	}

	@Override
	public RoomType getTypeByID(String id) {
		// TODO Auto-generated method stub
		return pricedao.getTypeByID(id);
	}

	@Override
	public int updateNewprice(RoomType type) {
		// TODO Auto-generated method stub
		return pricedao.updateNewprice(type);
	 
	}

	@Override
	public int updateIDprice(RoomType type) {
		// TODO Auto-generated method stub
		return pricedao.updateIDprice(type);
	}

	@Override
	public RoomType getID(String id) {
		// TODO Auto-generated method stub
		return pricedao.getID(id);
	}


	
	

}
