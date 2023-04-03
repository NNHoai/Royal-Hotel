package com.fa.mock.Model.web;

public class DetailBooking {
	private String IDBookingDetail;
	private String IDBooking;
	private String IDRoom;
	private String QuantityRoom;
	public DetailBooking(String iDBookingDetail, String iDBooking, String iDRoom, String quantityRoom) {
		super();
		IDBookingDetail = iDBookingDetail;
		IDBooking = iDBooking;
		IDRoom = iDRoom;
		QuantityRoom = quantityRoom;
	}
	public String getIDBookingDetail() {
		return IDBookingDetail;
	}
	public void setIDBookingDetail(String iDBookingDetail) {
		IDBookingDetail = iDBookingDetail;
	}
	public String getIDBooking() {
		return IDBooking;
	}
	public void setIDBooking(String iDBooking) {
		IDBooking = iDBooking;
	}
	public String getIDRoom() {
		return IDRoom;
	}
	public void setIDRoom(String iDRoom) {
		IDRoom = iDRoom;
	}
	public String getQuantityRoom() {
		return QuantityRoom;
	}
	public void setQuantityRoom(String quantityRoom) {
		QuantityRoom = quantityRoom;
	}
}
