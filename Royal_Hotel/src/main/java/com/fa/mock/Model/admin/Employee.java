package com.fa.mock.Model.admin;

public class Employee {
	private String id;
	private String fullname;
	private String gender;
	private String birthday;
	private String address;
	private String phone;
	private String email;
	private String citizenID;
	private String userName;

	public Employee() {
		super();
	}

	public Employee(String id, String fullname, String gender, String birthday, String address, String phone, String email,
			String citizenID, String userName) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.citizenID = citizenID;
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCitizenID() {
		return citizenID;
	}

	public void setCitizenID(String citizenID) {
		this.citizenID = citizenID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
}
