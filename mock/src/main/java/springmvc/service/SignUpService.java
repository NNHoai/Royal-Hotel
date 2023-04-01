package springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import springmvc.model.SignUpForm;
@Service
public interface SignUpService {
	int getDataSignUp(SignUpForm seOfAccount);
	
	List<SignUpForm> checkUser(String username);
}
