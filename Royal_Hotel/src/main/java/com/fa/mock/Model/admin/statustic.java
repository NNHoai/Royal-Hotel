package com.fa.mock.Model.admin;

public class statustic {
	private String dateBill;
	private float totalPrice;

	public String getDateBill() {
		return dateBill;
	}

	public void setDateBill(String dateBill) {
		this.dateBill = dateBill;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public statustic(String dateBill, float totalPrice) {
		super();
		this.dateBill = dateBill;
		this.totalPrice = totalPrice;
	}

	public statustic() {
		super();
	}

}
