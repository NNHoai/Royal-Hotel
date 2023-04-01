package com.fa.mock.Model.admin;

public class Room {
	private String id;
	private String roomName;
	private String status;
	private String type;
	

	public Room() {
		super();
	}

	public Room(String id, String roomName, String status, String type) {
		super();
		this.id = id;
		this.roomName = roomName;
		this.status = status;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

}
