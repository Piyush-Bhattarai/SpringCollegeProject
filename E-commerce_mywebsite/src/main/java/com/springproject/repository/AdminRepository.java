package com.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	Admin findByAdminemailAndAdminpassword(String email, String psw);
	
	Admin findByAdminemail(String email);
}
