package com.fa.mock.Services.admin;

import java.util.List;

import com.fa.mock.Model.admin.PriceByTime;
import com.fa.mock.Model.web.RoomType;

public interface PriceService {
	public List<PriceByTime> getDataPrice();
	public int updatePrice(PriceByTime price);
	public int insertPrice(PriceByTime price);
	public PriceByTime getPriceByID(String id);
	public int DeletePrice(PriceByTime price);
	public  List<RoomType> getDataRoomType();
	public List<RoomType> getDataRoomT();
	public int updateRoomtype(RoomType type);
	public RoomType getTypeByID(String id);
	public int updateNewprice(RoomType type);
	public int updateIDprice(RoomType type);
	public RoomType getID(String id);
	
	
	
	

}
