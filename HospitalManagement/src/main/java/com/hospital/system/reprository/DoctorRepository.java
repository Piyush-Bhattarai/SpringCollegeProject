package com.hospital.system.reprository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hospital.system.model.Doctor;


public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
	
	

}
