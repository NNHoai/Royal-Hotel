package com.fa.mock.Dao.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Mapper.admin.MapperBank;
import com.fa.mock.Mapper.admin.MapperRoom;
import com.fa.mock.Model.admin.Bank;
import com.fa.mock.Model.admin.Room;

@Repository
public class BankDao {
	@Autowired
	JdbcTemplate _jdbctemplate;

	public List<Bank> getDataBank() {
		List<Bank> list = new ArrayList<Bank>();
		String sql = "SELECT* FROM PAYMENTTYPE";
		list = _jdbctemplate.query(sql, new MapperBank());
		return list;
	}

//	public int updateRoom(Bank room) {
//		String sql = "UPDATE ROOM SET NameRoom=N'"
//				+ room. getRoomName() + "',Status=N'Trống', IDRoomType='" + room.getType() + "'WHERE IDRoom = '" + room.getId() + "'";
//		int n = _jdbctemplate.update(sql);
//		return n;
//	}
//	public int insertRoom(Room room) {
//		String sql = "INSERT INTO ROOM (IDRoom,NameRoom,IDRoomType) VALUES ('" + room.getId() + "','" + room.getRoomName() + "','" + room.getType() + "')";
//		int n = _jdbctemplate.update(sql);
//		return n;
//	}
//	public Room getRoomByID(String id) {
//		List<Room> list = new ArrayList<Room>();
//		String sql = "SELECT* FROM ROOM WHERE IDRoom = '"+id+"'";
//		list = _jdbctemplate.query(sql, new MapperRoom());
//		Room room = list.get(0);
//		return room;
//	}
	public int insertBank(Bank bank) {
		String sql = "INSERT INTO PAYMENTTYPE (IDTypePay,PayName,Description) VALUES ('" + bank.getId() + "','"
				+ bank.getPayname() + "','" + bank.getDescription() + "')";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public int updateBank(Bank bank) {
		String sql = "UPDATE PAYMENTTYPE SET IDTypePay ='" + bank.getId() + "', PayName='" + bank.getPayname()
				+ "', Description='" + bank.getDescription() + "' WHERE IDTypePay = '" + bank.getId() + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public Bank getBankByID(String id) {
		List<Bank> list = new ArrayList<Bank>();
		String sql = "SELECT* FROM PAYMENTTYPE WHERE IDTypePay = '" + id + "'";
		list = _jdbctemplate.query(sql, new MapperBank());
		Bank bk = list.get(0);
		return bk;
	}

}
