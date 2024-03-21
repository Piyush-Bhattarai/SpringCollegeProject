package com.hospital.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hospital.system.model.Patient;
import com.hospital.system.reprository.PatientRepository;
import com.hospital.system.service.PatientService;

@Controller
public class PatientFormController {
	
	@Autowired
	private PatientRepository patrepo;
	
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/patientform")
	public String getPatientForm() {
		
		
		return "PatientForm";
	}
	
	@PostMapping("/patientform")
	public String postPatientForm(@ModelAttribute Patient patient) {
		
		patrepo.save(patient);
		
		return "Home";
	}

}
