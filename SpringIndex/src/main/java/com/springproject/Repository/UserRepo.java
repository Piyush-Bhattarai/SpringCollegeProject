package com.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	User findByUsernameAndPassword(String un, String psw);

}
