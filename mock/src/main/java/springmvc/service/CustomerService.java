package springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import springmvc.model.CustomerModel;

@Service
public interface CustomerService {
	
	int insertCustomer(CustomerModel customer);
//	List<SignUpForm> checkUser(String username);
	String getIdCustommer();
	List<CustomerModel> getDataCustomer();
	CustomerModel getCustomer(String username);
	public int updateInfoCustomer(CustomerModel customerManager);
}
