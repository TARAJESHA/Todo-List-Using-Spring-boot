package com.inLearing.Springboot.myfirstwebapp.AthenticationService;

import org.springframework.stereotype.Service;

@Service
public class AthenticationService {
	public boolean athenticate(String userName, String password) {
		boolean isValidUserName=userName.equalsIgnoreCase("rajesh");
		boolean isValidPassword=password.equalsIgnoreCase("12345");
		return isValidPassword && isValidUserName;
	}

}
