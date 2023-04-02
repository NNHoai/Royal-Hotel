package com.fa.mock.Model.admin;


public class HotelManage {
	private String nameHotel;
	private String addressHotel;
	private String phoneHotel;
	private String emailHotel;
	private String faxHotel;
	
	
	
	public HotelManage() {
		super();
	}
	
	public HotelManage(String nameHotel, String addressHotel, String phoneHotel, String emailHotel, String faxHotel) {
		super();
		this.nameHotel = nameHotel;
		this.addressHotel = addressHotel;
		this.phoneHotel = phoneHotel;
		this.emailHotel = emailHotel;
		this.faxHotel = faxHotel;
	}
	public String getNameHotel() {
		return nameHotel;
	}
	public void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}
	public String getAddressHotel() {
		return addressHotel;
	}
	public void setAddressHotel(String addressHotel) {
		this.addressHotel = addressHotel;
	}
	public String getPhoneHotel() {
		return phoneHotel;
	}
	public void setPhoneHotel(String phoneHotel) {
		this.phoneHotel = phoneHotel;
	}
	public String getEmailHotel() {
		return emailHotel;
	}
	public void setEmailHotel(String emailHotel) {
		this.emailHotel = emailHotel;
	}
	public String getFaxHotel() {
		return faxHotel;
	}
	public void setFaxHotel(String faxHotel) {
		this.faxHotel = faxHotel;
	}
	

	
}
