package com.fa.mock.Services.admin.HotelServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.mock.Dao.admin.RoomDao;
import com.fa.mock.Model.admin.Room;
import com.fa.mock.Services.admin.RoomService;

@Service
public class RoomImpl implements RoomService {
	@Autowired
	RoomDao roomdao;

	@Override
	public List<Room> getDataRoom() {
		return roomdao.getDataRoom();
	}

	@Override
	public int updateRoom(Room room) {
		return roomdao.updateRoom(room);
	}

	@Override
	public int insertRoom(Room room) {
		return roomdao.insertRoom(room);
	}

	@Override
	public Room getRoomByID(String id) {
		return roomdao.getRoomByID(id);
	}

	@Override
	public int DeleteRoom(Room room) {
		return roomdao.DeleteRoom(room);
	}

	@Override
	public int getRoomEmpty() {
		// TODO Auto-generated method stub
		return roomdao.getRoomEmpty();
	}

	@Override
	public int getCountRoom() {
		// TODO Auto-generated method stub
		return roomdao.getCountRoom();
	}

	@Override
	public int getCountR1() {
		// TODO Auto-generated method stub
		return roomdao.getCountR1();
	}

	@Override
	public int getCountR2() {
		// TODO Auto-generated method stub
		return roomdao.getCountR2();
	}

	@Override
	public int getCountR3() {
		// TODO Auto-generated method stub
		return roomdao.getCountR3();
	}

	@Override
	public int getCountR4() {
		// TODO Auto-generated method stub
		return roomdao.getCountR4();
	}

	@Override
	public int getCountR5() {
		// TODO Auto-generated method stub
		return roomdao.getCountR5();
	}

	@Override
	public int getCountR6() {
		// TODO Auto-generated method stub
		return roomdao.getCountR6();
	}

	@Override
	public int getCountR7() {
		// TODO Auto-generated method stub
		return roomdao.getCountR7();
	}

	@Override
	public int getCountNR1() {
		// TODO Auto-generated method stub
		return roomdao.getCountNR1();
	}

	@Override
	public int getCountNR2() {
		// TODO Auto-generated method stub
		return roomdao.getCountNR2();
	}

	@Override
	public int getCountNR3() {
		// TODO Auto-generated method stub
		return roomdao.getCountNR3();
	}

	@Override
	public int getCountNR4() {
		// TODO Auto-generated method stub
		return roomdao.getCountNR4();
	}

	@Override
	public int getCountNR5() {
		// TODO Auto-generated method stub
		return roomdao.getCountNR5();
	}

	@Override
	public int getCountNR6() {
		// TODO Auto-generated method stub
		return roomdao.getCountNR6();
	}

	@Override
	public int getCountNR7() {
		// TODO Auto-generated method stub
		return roomdao.getCountNR7();
	}

	@Override
	public String getIDRoomByIDRoomType(String idRoomType, String dateCheckin, String dateCheckout) {
		return roomdao.getIDRoomByIDRoomType(idRoomType, dateCheckin, dateCheckout);
	}

}
