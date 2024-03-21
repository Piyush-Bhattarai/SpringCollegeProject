package com.springproject.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.model.Admin;
import com.springproject.repository.AdminRepository;
import com.springproject.service.Adminservice;

@Service
public class AdminserviceImpl implements Adminservice{
	
	@Autowired
	private AdminRepository adminrepo;
		
	

	@Override
	public void savemessage(Admin admin) {
		
		adminrepo.save(admin);
		
	}
	
	

}
