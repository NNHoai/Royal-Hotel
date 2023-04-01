package com.fa.mock.Model.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOMTYPE")
public class RoomType {
	@Id
	@Column(name = "IDRoomType")
	private String idRoomType;

	@Column(name = "NameRoomType")
	private String nameRoomType;

	@Column(name = "Price")
	private float price;
	
	@Column(name = "Description")
	private String description;

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
