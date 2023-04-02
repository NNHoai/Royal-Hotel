package com.fa.mock.Dao.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Mapper.admin.MapperPrice;

import com.fa.mock.Mapper.web.MapperRoomType;
import com.fa.mock.Model.admin.PriceByTime;

import com.fa.mock.Model.web.RoomType;

@Repository
public class PriceDao {
	@Autowired
	JdbcTemplate _jdbctemplate;

	public List<PriceByTime> getDataPrice() {
		List<PriceByTime> list = new ArrayList<PriceByTime>();
		String sql = "SELECT* FROM PRICEBYTIME";
		list = _jdbctemplate.query(sql, new MapperPrice());
		return list;
	}

	public int updateprice(PriceByTime price) {
		String sql = "UPDATE PRICEBYTIME SET  IDPriceByTime= '" + price.getId() + "' , Reason='" + price.getReason()
				+ "',Percents='" + price.getPersent() + "', DateFrom='" + price.getDateFrom() + "', DateTo='"
				+ price.getDateTo() + "'WHERE IDPriceByTime = '" + price.getId() + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public int insertPrice(PriceByTime price) {
		String sql = "INSERT INTO PRICEBYTIME VALUES ('" + price.getId() + "','" + price.getReason() + "','"
				+ price.getPersent() + "','" + price.getDateFrom() + "','" + price.getDateTo() + "')";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public PriceByTime getPriceByID(String id) {
		List<PriceByTime> list = new ArrayList<PriceByTime>();
		String sql = "SELECT* FROM PRICEBYTIME WHERE IDPriceByTime = '" + id + "'";
		list = _jdbctemplate.query(sql, new MapperPrice());
		PriceByTime price = list.get(0);
		return price;
	}

	public int DeletePrice(PriceByTime price) {
		String sql = "DELETE FROM PRICEBYTIME WHERE IDPriceByTime = '" + price.getId() + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public List<RoomType> getDataRoomType() {
		List<RoomType> list = new ArrayList<>();
		String sql = "SELECT r.IDRoomType, r.NameRoomType, (r.Price*(1+p.Percents/100)) AS Price, r.Description, r.IDPriceByTime FROM ROOMTYPE r JOIN PRICEBYTIME p ON r.IDPriceByTime = p.IDPriceByTime";
		list = _jdbctemplate.query(sql, new MapperRoomType());
		return list;
	}

	public List<RoomType> getDataRoomT() {
		List<RoomType> list = new ArrayList<>();
		String sql = "SELECT* FROM ROOMTYPE ";
		list = _jdbctemplate.query(sql, new MapperRoomType());
		return list;
	}

	public int updateRoomtype(RoomType type) {
		String sql = "UPDATE ROOMTYPE SET IDRoomType ='"+type.getIdRoomType()+"',NameRoomType='"+type.getNameRoomType()+"', Price ='" + type.getPrice() + "',Description ='" + type.getDescription() + "',IDPriceByTime ='" + type.getIdPrice() + "' WHERE IDRoomType ='"
				+ type.getIdRoomType() + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public RoomType getTypeByID(String id) {
		List<RoomType> list = new ArrayList<RoomType>();
		String sql = "SELECT* FROM ROOMTYPE WHERE IDRoomType = '" + id + "'";
		list = _jdbctemplate.query(sql, new MapperRoomType());
		RoomType rt = list.get(0);
		return rt;
		
	}

	public int updateNewprice(RoomType type) {
		String sql = "UPDATE ROOMTYPE SET IDRoomType ='"+type.getIdRoomType()+"',NameRoomType='"+type.getNameRoomType()+"', Price ='" + type.getPrice() + "',Description ='" + type.getDescription() + "',IDPriceByTime ='" + type.getIdPrice() + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public int updateIDprice(RoomType type) {
		String sql = "UPDATE ROOMTYPE SET IDPriceByTime='"+type.getIdRoomType()+"'";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public RoomType getID(String id) {
		List<RoomType> list = new ArrayList<RoomType>();
		String sql = "SELECT* FROM ROOMTYPE WHERE IDPriceByTime = '" + id + "'";
		list = _jdbctemplate.query(sql, new MapperRoomType());
		RoomType price = list.get(0);
		return price;
	}
}
