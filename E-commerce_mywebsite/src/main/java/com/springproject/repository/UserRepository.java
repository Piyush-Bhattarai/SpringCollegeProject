package com.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.model.User;
import java.util.List;



public interface UserRepository extends JpaRepository<User, Integer>{

	
	 User findByEmailAndPassword(String un, String psw);
        
	 User findByEmail(String un);
	 
	 User findByPassword(String psw);

	 
	 
	 

	
	
}
