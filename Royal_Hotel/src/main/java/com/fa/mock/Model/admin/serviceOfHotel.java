package com.fa.mock.Model.admin;

import javax.persistence.Entity;

@Entity
public class serviceOfHotel {
	private String idService;
	private String nameServices;
	private float price;
	private String description;
	
	
	
	public serviceOfHotel(String idService, String nameServices, float price, String description) {
		super();
		this.idService = idService;
		this.nameServices = nameServices;
		this.price = price;
		this.description = description;
	}
	
	
	public serviceOfHotel() {
		super();
	}


	public String getIdService() {
		return idService;
	}
	public void setIdService(String idService) {
		this.idService = idService;
	}
	public String getNameServices() {
		return nameServices;
	}
	public void setNameServices(String nameServices) {
		this.nameServices = nameServices;
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
