package com.fa.mock.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fa.mock.Model.SignUpForm;
@Service
public interface SignUpService {
	int getDataSignUp(SignUpForm seOfAccount);
	
	List<SignUpForm> checkUser(String username);
}
