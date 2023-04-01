package com.fa.mock.Model.web;


public class RoomType {
	
	private String idRoomType;

	private String nameRoomType;

	private float price;

	private String description;
	private String idPrice;
	

		
	public RoomType() {
		super();
	}

	public RoomType(String idRoomType, String nameRoomType, float price, String description, String idPrice) {
		super();
		this.idRoomType = idRoomType;
		this.nameRoomType = nameRoomType;
		this.price = price;
		this.description = description;
		this.idPrice = idPrice;
	}

	public String getIdPrice() {
		return idPrice;
	}

	public void setIdPrice(String idPrice) {
		this.idPrice = idPrice;
	}

	public String getIdRoomType() {
		return idRoomType;
	}

	public void setIdRoomType(String idRoomType) {
		this.idRoomType = idRoomType;
	}

	public String getNameRoomType() {
		return nameRoomType;
	}

	public void setNameRoomType(String nameRoomType) {
		this.nameRoomType = nameRoomType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
