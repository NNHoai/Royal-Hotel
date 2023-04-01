package com.fa.mock.Services.admin;

import java.util.List;


import com.fa.mock.Model.admin.Room;

public interface RoomService {
	public List<Room> getDataRoom();
	public Room getRoomByID(String id);
	public int updateRoom(Room room);
	public int insertRoom(Room room);
	public int DeleteRoom(Room room);
	public int getRoomEmpty();
	public int getCountRoom();
	public int getCountR1();
	public int getCountR2();
	public int getCountR3();
	public int getCountR4();
	public int getCountR5();
	public int getCountR6();
	public int getCountR7();
	public int getCountNR1();
	public int getCountNR2();
	public int getCountNR3();
	public int getCountNR4();
	public int getCountNR5();
	public int getCountNR6();
	public int getCountNR7();
}
