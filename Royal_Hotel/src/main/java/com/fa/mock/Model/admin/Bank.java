package com.fa.mock.Model.admin;

public class Bank {
	private int id;
	private String payname;
	private String description;
	
	public Bank() {
		super();
	}

	public Bank(int id, String payname, String description) {
		super();
		this.id = id;
		this.payname = payname;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPayname() {
		return payname;
	}

	public void setPayname(String payname) {
		this.payname = payname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
