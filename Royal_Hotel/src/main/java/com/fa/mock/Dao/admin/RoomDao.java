package com.fa.mock.Dao.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Mapper.admin.MapperRoom;
import com.fa.mock.Model.admin.Room;



@Repository
public class RoomDao {
	@Autowired
	JdbcTemplate _jdbctemplate;
	public List<Room> getDataRoom(){
		List<Room> list = new ArrayList<Room>();
		String sql = "SELECT* FROM ROOM";
		list = _jdbctemplate.query(sql, new MapperRoom());
		return list;
	}
	public String getIDRoomByIDRoomType(String idRoomType, String dateCheckin, String dateCheckout){
		String sql = "SELECT TOP(1) r.IDRoom"
				+ " FROM ROOM r"
				+ " WHERE r.IDRoomType = '"+ idRoomType + "' AND r.IDRoom "
				+ "  NOT IN ( SELECT r.IDRoom FROM ROOMTYPE rt"
				+ "	LEFT JOIN BOOKINGDETAIL bd ON bd.IDRoom = r.IDRoom "
				+ "	LEFT JOIN BOOKING b ON b.IDBooking = bd.IDBooking "
				+ "	WHERE b.DateCheckin >= '"+dateCheckin+"' "
				+ "    OR b.DateCheckout <= '"+dateCheckout+"'"
				+ "	AND r.IDRoomType = rt.IDRoomType )";
		String idroom = _jdbctemplate.queryForObject(sql, String.class);
		return idroom;
	}
	public int updateRoom(Room room) {
		String sql = "UPDATE ROOM SET NameRoom=N'"
				+ room. getRoomName() + "',Status=N'Trống', IDRoomType='" + room.getType() + "'WHERE IDRoom = '" + room.getId() + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}
	public int insertRoom(Room room) {
		String sql = "INSERT INTO ROOM (IDRoom,NameRoom,IDRoomType) VALUES ('" + room.getId() + "','" + room.getRoomName() + "','" + room.getType() + "')";
		int n = _jdbctemplate.update(sql);
		return n;
	}
	public Room getRoomByID(String id) {
		List<Room> list = new ArrayList<Room>();
		String sql = "SELECT* FROM ROOM WHERE IDRoom = '"+id+"'";
		list = _jdbctemplate.query(sql, new MapperRoom());
		Room room = list.get(0);
		return room;
	}
	public int DeleteRoom(Room room) {
		String sql = "DELETE FROM ROOM WHERE IDRoom = '" + room.getId() + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}
	public int getRoomEmpty() {
		String sql = "SELECT COUNT(Status) FROM ROOM WHERE Status=N'Trống'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountRoom() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
		
	}
	public int getCountR1() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT001'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountR2() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT002'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountR3() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT003'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountR4() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT004'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountR5() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT005'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountR6() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT006'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountR7() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT007'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountNR1() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT001' and Status=N'Đã đặt'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountNR2() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT002' and Status=N'Đã đặt'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountNR3() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT003' and Status=N'Đã đặt'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountNR4() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT004' and Status=N'Đã đặt'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountNR5() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT005' and Status=N'Đã đặt'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}
	public int getCountNR6() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT006' and Status=N'Đã đặt'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;	}
	public int getCountNR7() {
		String sql = "SELECT COUNT(NameRoom) FROM ROOM WHERE IDRoomType='RT007' and Status=N'Đã đặt'";
		int num = _jdbctemplate.queryForObject(sql, Integer.class);
		return num;
	}

	
}
