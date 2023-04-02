package com.fa.mock.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fa.mock.Model.CustomerModel;

@Service
public interface CustomerService {
	
	int insertCustomer(CustomerModel customer);
//	List<SignUpForm> checkUser(String username);
	String getIdCustommer();
	List<CustomerModel> getDataCustomer();
	CustomerModel getCustomer(String username);
	public int updateInfoCustomer(CustomerModel customerManager);
}
