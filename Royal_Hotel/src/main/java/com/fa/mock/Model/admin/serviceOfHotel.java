package com.fa.mock.Model.admin;

public class serviceOfHotel {
	private String idService;
	private String nameServices;
	private float price;
	private String description;
	
	
	public serviceOfHotel(String iDServices, String nameServices, float price, String description) {
		super();
		idService = iDServices;
		this.nameServices = nameServices;
		this.price = price;
		this.description = description;
	}


	public serviceOfHotel() {
		super();
	}
	
	
	public String getIDServices() {
		return idService;
	}
	public void setIDServices(String iDServices) {
		idService = iDServices;
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
