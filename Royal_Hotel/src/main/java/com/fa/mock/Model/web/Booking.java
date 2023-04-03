package com.fa.mock.Model.web;

public class Booking {
	private String IDBooking;
	private String DateCheckin;
	private String DateCheckout;
	private String DateBook;
	private String IDCustomer;
	
	public Booking(String iDBooking, String dateCheckin, String dateCheckout, String dateBook, String iDCustomer) {
		super();
		IDBooking = iDBooking;
		DateCheckin = dateCheckin;
		DateCheckout = dateCheckout;
		DateBook = dateBook;
		IDCustomer = iDCustomer;
	}

	public String getIDBooking() {
		return IDBooking;
	}

	public void setIDBooking(String iDBooking) {
		IDBooking = iDBooking;
	}

	public String getDateCheckin() {
		return DateCheckin;
	}

	public void setDateCheckin(String dateCheckin) {
		DateCheckin = dateCheckin;
	}

	public String getDateCheckout() {
		return DateCheckout;
	}

	public void setDateCheckout(String dateCheckout) {
		DateCheckout = dateCheckout;
	}

	public String getDateBook() {
		return DateBook;
	}

	public void setDateBook(String dateBook) {
		DateBook = dateBook;
	}

	public String getIDCustomer() {
		return IDCustomer;
	}

	public void setIDCustomer(String iDCustomer) {
		IDCustomer = iDCustomer;
	}
	
	
}
