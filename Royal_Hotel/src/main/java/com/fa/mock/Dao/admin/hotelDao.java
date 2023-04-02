package com.fa.mock.Dao.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Mapper.admin.MapperHotel;
import com.fa.mock.Mapper.admin.MapperService;
import com.fa.mock.Mapper.admin.statusticRevenue;
import com.fa.mock.Model.admin.HotelManage;
import com.fa.mock.Model.admin.serviceOfHotel;
import com.fa.mock.Model.admin.statustic;

@Repository
public class hotelDao {
	@Autowired
	JdbcTemplate _jdbctemplate;

	public List<HotelManage> getDataHotelManage() {
		List<HotelManage> list = new ArrayList<HotelManage>();
		String sql = "Select TOP (1) * from HOTEL";
		list = _jdbctemplate.query(sql, new MapperHotel());
		return list;
	}

	public int updateInfoHotel(HotelManage hotelManage) {
		String sql = "update HOTEL set NameHotel = N'" + hotelManage.getNameHotel() + "' , Address= N'"
				+ hotelManage.getAddressHotel() + "', Phone='" + hotelManage.getPhoneHotel() + "', Email='"
				+ hotelManage.getEmailHotel() + "', Fax='" + hotelManage.getFaxHotel() + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public List<serviceOfHotel> getDataservice() {
		List<serviceOfHotel> list = new ArrayList<serviceOfHotel>();
		String sql = "Select * from SERVICES";
		list = _jdbctemplate.query(sql, new MapperService());
		return list;
	}
	public int createService(serviceOfHotel seOfHotel) {
		String sql = "INSERT INTO SERVICES VALUES ('"+ seOfHotel.getIdService() + "','" + seOfHotel.getNameServices() + "','" + seOfHotel.getPrice()+ "', '" + seOfHotel.getDescription() + "')";
		int n = _jdbctemplate.update(sql);
		return n;
	}
	public serviceOfHotel getServiceByID(String id) {
		List<serviceOfHotel> list = new ArrayList<serviceOfHotel>();
		String sql = "SELECT * FROM SERVICES WHERE IDServices = '"+id+"'";
		list = _jdbctemplate.query(sql, new MapperService());
		serviceOfHotel sv = list.get(0);
		return sv;
	}

	public int updateService(serviceOfHotel serviceofHotel) {
		String sql = "update SERVICES set NameServices = N'" + serviceofHotel.getNameServices() + "' , Price= N'"
				+ serviceofHotel.getPrice() + "', Description='" + serviceofHotel.getDescription() +"' WHERE IDServices = '"+serviceofHotel.getIdService()+"'";
		int n = _jdbctemplate.update(sql);
		return n;
	}
	
	public int deleteService(serviceOfHotel deleteservice) {
		String sql = "DELETE FROM SERVICES WHERE IDServices = '"+deleteservice.getIdService()+"'";
		int n = _jdbctemplate.update(sql);
		return n;
	}
	
	public List<statustic> getStatustic()
	{
		List<statustic> list = new ArrayList<statustic>();
		String a = "Select MONTH(DateBill) AS MonthBill,  SUM(TotalPrice) AS TotalPrice from PAYMENT GROUP BY MONTH(DateBill)";
		list = _jdbctemplate.query(a, new statusticRevenue());
		return list;
	}
}
