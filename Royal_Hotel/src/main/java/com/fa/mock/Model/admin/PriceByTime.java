package com.fa.mock.Model.admin;

public class PriceByTime {
	private String id;
	private String reason;
	private float persent;
	private String dateFrom;
	private String dateTo;
	public PriceByTime() {
		super();
	}
	public PriceByTime(String id, String reason, float persent, String dateFrom, String dateTo) {
		super();
		this.id = id;
		this.reason = reason;
		this.persent = persent;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public float getPersent() {
		return persent;
	}
	public void setPersent(float persent) {
		this.persent = persent;
	}
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

}
