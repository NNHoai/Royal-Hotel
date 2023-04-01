package springmvc.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springmvc.model.CustomerModel;
import springmvc.model.SignUpForm;

public class CustomerMapper implements RowMapper<CustomerModel>{
	@Override
	public CustomerModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		CustomerModel customer = new CustomerModel();
		customer.setIdCustomer(rs.getString("IDCustomer"));
		customer.setFullName(rs.getString("FullName"));
		customer.setGender(rs.getByte("Gender"));
		customer.setBirthday(rs.getString("Birthday"));
		customer.setAddress(rs.getString("Address"));
		customer.setPhone(rs.getString("Phone"));
		customer.setEmail(rs.getString("Email"));
		customer.setCitizenID(rs.getString("CitizenID"));
		customer.setUserName(rs.getString("UserName"));
		customer.setIdType(rs.getInt("IDType"));
		customer.setHeadDelegate(rs.getString("HeadDelegate"));
		return customer;
	}
}
