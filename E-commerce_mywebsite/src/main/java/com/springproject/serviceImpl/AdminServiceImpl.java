package com.springproject.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.model.Admin;
import com.springproject.repository.AdminRepository;
import com.springproject.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	
	@Autowired
	private AdminRepository  adminrepo;
	

	@Override
	public void signup(Admin admin) {
		
		adminrepo.save(admin);
		
		
	}

	@Override
	public Admin login(String email, String psw) {
		
		
		return adminrepo.findByAdminemailAndAdminpassword(email, psw);
	}

	@Override
	public Admin checkemail(String email) {

		
		return adminrepo.findByAdminemail(email);
	}

	
}
