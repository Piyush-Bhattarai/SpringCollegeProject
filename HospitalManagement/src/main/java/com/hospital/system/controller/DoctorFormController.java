package com.hospital.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hospital.system.model.Doctor;
import com.hospital.system.reprository.DoctorRepository;

@Controller
public class DoctorFormController {
	
	@Autowired
	private DoctorRepository Docrepo;
	
	@GetMapping("/doctorform")
	public String getDoctorForm() {
		
		
		return "DoctorForm";
	}

	@PostMapping("/doctorform")
	public String postDoctorForm(@ModelAttribute Doctor doctor, Model model) {
		
		Docrepo.save(doctor);
		model.addAttribute("name", doctor.getName());
		
		return "Home";
	}
}
