package com.hospital.system.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="spcialization_tbl")
public class Specialization {
	
	@Id   //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // auto increment
	private int id;
	private String code;
	private String name;
	private String note;
	
	

}
