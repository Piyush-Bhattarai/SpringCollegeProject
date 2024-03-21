package com.hospital.system.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hospital.system.model.Patient;
import com.hospital.system.reprository.PatientRepository;
import com.hospital.system.service.PatientService;

@Primary
@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	
	@Override
	public void add(Patient patient) {
		// TODO Auto-generated method stub
		patientRepository.save(patient);
		
	}

}
