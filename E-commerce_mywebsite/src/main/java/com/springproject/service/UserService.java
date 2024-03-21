package com.springproject.service;

import com.springproject.model.User;

public interface UserService {
	
	void signup(User user);
	
	User login(String un, String psw);

	User checkemail(String un);
	
	long countuser();
	
	User checkpassword(String psw);
	
	void updatepassword(User user);
	
	User getuserbyid(int id);
	
	
}
