package com.springproject.service;

import com.springproject.model.Admin;

public interface AdminService {

	void signup(Admin admin);

	Admin login(String email, String psw);

	Admin checkemail(String email);

}
