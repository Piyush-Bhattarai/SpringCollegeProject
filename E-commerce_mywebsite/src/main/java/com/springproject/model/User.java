package com.springproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="user_table")
public class User {
	
	@Id   // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto increment
	private int id;
	private String name;
	private String email;
	private String phone;
	private String password;
	private String userimg;
	private String userAddress;
	
	

}
