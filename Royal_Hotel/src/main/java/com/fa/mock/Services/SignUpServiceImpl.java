package com.fa.mock.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.mock.Dao.registerDao;
import com.fa.mock.Model.SignUpForm;

@Service
public class SignUpServiceImpl implements SignUpService{
	@Autowired
	registerDao registerDao;

//	@Override
//	public int getDataSignUp(SignUpForm seOfAccount) {
//
//		seOfAccount.setPassword(BCrypt.hashpw(seOfAccount.getPassword(), BCrypt.gensalt(12)));
//		return registerDao.createAccount(seOfAccount);
//	}

	@Override
	public int getDataSignUp(SignUpForm seOfAccount) {
		return registerDao.createAccount(seOfAccount);
	}

	@Override
	public List<SignUpForm> checkUser(String username) {

		return registerDao.checkAccount(username);
	}
}
