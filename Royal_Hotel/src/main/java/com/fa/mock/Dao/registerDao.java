package com.fa.mock.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Mapper.AccountMapper;
import com.fa.mock.Model.SignUpForm;

@Repository
public class registerDao {
	
	@Autowired
	JdbcTemplate _jdbctemplate;
	public int createAccount(SignUpForm seOfAccount) {
		String sql = "INSERT INTO ACCOUNT VALUES ('"+ seOfAccount.getUserName() + "','" + seOfAccount.getPassword()+"', 1 )";
		int n = _jdbctemplate.update(sql);
		return n;
	}
	
	public List<SignUpForm> checkAccount(String username) {
		String sql = "SELECT * FROM ACCOUNT WHERE UserName = '" + username + "'";
		List<SignUpForm> n = _jdbctemplate.query(sql, new AccountMapper());
		return n;
	}
	
	public int insertCustomer(SignUpForm seOfAccount) {
		String sql = "INSERT INTO CUSTOMER VALUES ('"+ seOfAccount.getUserName() + "','" + seOfAccount.getPassword()+"', 1 )";
		int n = _jdbctemplate.update(sql);
		return n;
	}
}
