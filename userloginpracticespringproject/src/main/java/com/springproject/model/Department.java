package com.springproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="department_tbl")
public class Department {
	
	@Id  // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dept_name;
	private String dept_hod;
	private String dept_phone;
}
