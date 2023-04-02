package com.fa.mock.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	JdbcTemplate _jdbctemplate;

	@Override
	public boolean validateUser(String username, String password) {
		int count = _jdbctemplate.queryForObject("select count(*) from ACCOUNT where UserName=? and PassWord=?",
				Integer.class, username, password);
		if (count == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int getRole(String username) {
		int role = _jdbctemplate.queryForObject("select IDRole from ACCOUNT where UserName=?",
				Integer.class, username);
		return role;
	}

	@Override
	public int checkExistsUser(String username) {
		int count =  _jdbctemplate.queryForObject("select count(UserName) from ACCOUNT where UserName=? ",
				Integer.class, username);
		return count;
	}
}
