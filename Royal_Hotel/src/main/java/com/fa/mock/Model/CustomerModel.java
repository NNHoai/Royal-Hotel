package com.fa.mock.Model;

public class CustomerModel {
	private String idCustomer;
	private String fullName;
	private byte gender;
	private String birthday;
	private String address;
	private String phone;
	private String email;
	private String citizenID;
	private String userName;
	private int idType;
	private String headDelegate;
	public CustomerModel() {
		
	}
	
	public CustomerModel(String idCustomer, String fullName, byte gender, String birthday, String address, String phone,
			String email, String citizenID, String userName, int idType, String headDelegate) {
		super();
		this.idCustomer = idCustomer;
		this.fullName = fullName;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.citizenID = citizenID;
		this.userName = userName;
		this.idType = idType;
		this.headDelegate = headDelegate;
	}
	
	public CustomerModel(String idCustomer, String fullName, String phone, String email, String citizenID) {
		super();
		this.idCustomer = idCustomer;
		this.fullName = fullName;
		this.phone = phone;
		this.email = email;
		this.citizenID = citizenID;
		this.idType = 2;
	}
	
	public CustomerModel(String idCustomer, String fullName, String phone, String email, String citizenID,
			String userName) {
		super();
		this.idCustomer = idCustomer;
		this.fullName = fullName;
		this.phone = phone;
		this.email = email;
		this.citizenID = citizenID;
		this.userName = userName;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
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
	public int getIdType() {
		return idType;
	}
	public void setIdType(int idType) {
		this.idType = idType;
	}
	public String getHeadDelegate() {
		return headDelegate;
	}
	public void setHeadDelegate(String headDelegate) {
		this.headDelegate = headDelegate;
	}

	@Override
	public String toString() {
		return "CustomerModel [idCustomer=" + idCustomer + ", fullName=" + fullName + ", gender=" + gender
				+ ", birthday=" + birthday + ", address=" + address + ", phone=" + phone + ", email=" + email
				+ ", citizenID=" + citizenID + ", userName=" + userName + ", idType=" + idType + ", headDelegate="
				+ headDelegate + "]";
	}
	
}
