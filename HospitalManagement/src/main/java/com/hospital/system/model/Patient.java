package com.hospital.system.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="Patient_tbl")
@Data
public class Patient {
	
	
	@Id     // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto Increment
	private int patientid;
	private String firstName;
    private String lastName;
	private String gender;
    private String phone;
    private String dob;
    private String maritalStatus;
    private String presentAddress;
    private String communicationAddress;
    
    @CollectionTable
    @ElementCollection
    private List<String> pastMedicalHistory;
    
    


}
