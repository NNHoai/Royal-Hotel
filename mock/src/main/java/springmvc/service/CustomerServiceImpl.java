package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.CustomerDao;
import springmvc.model.CustomerModel;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerDao customerDao;
	
	@Override
	public int insertCustomer(CustomerModel customer) {
		return customerDao.createCustommer(customer);
	}

	@Override
	public String getIdCustommer() {
		return customerDao.getIdCustomer();
	}

	@Override
	public CustomerModel getCustomer(String username) {
		return customerDao.getCustomer(username);		
	}

	@Override
	public List<CustomerModel> getDataCustomer() {
		return customerDao.getDataCustomer();
	}

	@Override
	public int updateInfoCustomer(CustomerModel customerManager) {
		return customerDao.updateInfoCustomer(customerManager);
	}

}
