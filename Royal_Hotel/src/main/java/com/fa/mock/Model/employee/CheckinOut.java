package com.fa.mock.Model.employee;

import java.util.Date;

public class CheckinOut {
	private String idBooking;
	private String idRoom;
	private String nameRoom;
	private String nameCustomer;
	private String timeCheckin;
	private String timeCheckout;
	public CheckinOut() {

	}
	public CheckinOut(String idBooking, String nameRoom, String nameCustomer, String timeCheckin,
			String timeCheckout, String idRoom) {
		this.idBooking = idBooking;
		this.nameRoom = nameRoom;
		this.nameCustomer = nameCustomer;
		this.timeCheckin = timeCheckin;
		this.timeCheckout = timeCheckout;
		this.idRoom = idRoom;
	}
	
	public CheckinOut(String idBooking, String timeCheckin, String timeCheckout) {
		super();
		this.idBooking = idBooking;
		this.timeCheckin = timeCheckin;
		this.timeCheckout = timeCheckout;
	}
	public String getIdBooking() {
		return idBooking;
	}
	public void setIdBooking(String idBooking) {
		this.idBooking = idBooking;
	}
	public String getNameRoom() {
		return nameRoom;
	}
	public void setNameRoom(String nameRoom) {
		this.nameRoom = nameRoom;
	}
	public String getNameCustomer() {
		return nameCustomer;
	}
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}
	public String getTimeCheckin() {
		return timeCheckin;
	}
	public String getIdRoom() {
		return idRoom;
	}
	public void setIdRoom(String idRoom) {
		this.idRoom = idRoom;
	}
	public void setTimeCheckin(String timeCheckin) {
		this.timeCheckin = timeCheckin;
	}
	public String getTimeCheckout() {
		return timeCheckout;
	}
	public void setTimeCheckout(String timeCheckout) {
		this.timeCheckout = timeCheckout;
	}
	
}
