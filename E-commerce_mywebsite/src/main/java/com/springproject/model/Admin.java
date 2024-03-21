package com.springproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="admin_tbl")
public class Admin {
	
	@Id   // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // auto incremnt
	private int id;
	private String adminname;
	private String adminphone;
	private String address;
	private String adminemail;
	private String adminpassword;
	

}
