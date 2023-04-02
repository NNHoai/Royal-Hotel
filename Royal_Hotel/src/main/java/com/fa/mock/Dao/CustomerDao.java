package com.fa.mock.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Mapper.CustomerMapper;
import com.fa.mock.Model.CustomerModel;

@Repository
public class CustomerDao {
	@Autowired
	JdbcTemplate _jdbctemplate;

	public int insertCustommer(CustomerModel customer) {
		String sql = "INSERT INTO CUSTOMER VALUES ('" + customer.getIdCustomer() + "', '" + customer.getFullName()
				+ "', '" + customer.getGender() + "', '" + customer.getBirthday() + "', '" + customer.getAddress()
				+ "', '" + customer.getPhone() + "', '" + customer.getEmail() + "', '" + customer.getCitizenID()
				+ "', '" + customer.getUserName() + "', '" + customer.getIdType() + "', '" + customer.getHeadDelegate()
				+ "')";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public int createCustommer(CustomerModel customer) {
		String sql = "INSERT INTO CUSTOMER(IDCustomer, FullName, Phone, Email, UserName, IDType) VALUES ('"
				+ customer.getIdCustomer() + "', '" + customer.getFullName() + "', '" + customer.getPhone() + "', '"
				+ customer.getEmail() + "', '" + customer.getUserName() + "', '" + customer.getIdType() + "')";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public String getIdCustomer() {
		String id = "C";
		String sql = "SELECT * FROM CUSTOMER";
		List<CustomerModel> list = _jdbctemplate.query(sql, new CustomerMapper());
		int size = list.size();
		id += ++size;
		return id;
	}

	public List<CustomerModel> getDataCustomer() {
		List<CustomerModel> list = new ArrayList<>();
		String sql = "SELECT * FROM CUSTOMER";
		list = _jdbctemplate.query(sql, new CustomerMapper());
		return list;
	}

	public CustomerModel getCustomer(String username) {
		CustomerModel cus = new CustomerModel();
		String sql = "SELECT * FROM CUSTOMER WHERE UserName = '" + username + "'";
		List<CustomerModel> list = _jdbctemplate.query(sql, new CustomerMapper());
		cus = list.get(0);
		return cus;
	}

	public int updateInfoCustomer(CustomerModel customerManage) {
		String sql = "update CUSTOMER set FullName = N'" + customerManage.getFullName() + "' , Gender='"
				+ customerManage.getGender() + "', Birthday='" + customerManage.getBirthday() + "', Address='"
				+ customerManage.getAddress() + "', Phone='" + customerManage.getPhone() + "', Email='"
				+ customerManage.getEmail() + "', CitizenID='" + customerManage.getCitizenID() + "' WHERE UserName = '"
				+ customerManage.getUserName() + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}

}
