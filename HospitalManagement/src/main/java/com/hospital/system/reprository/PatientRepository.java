package com.hospital.system.reprository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.system.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
