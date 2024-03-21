package com.broadway.springdemo.reprository;
import org.springframework.data.jpa.repository.JpaRepository;



import com.broadway.springdemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	  User findByUsernameAndPassword(String un, String psw);
	
}


