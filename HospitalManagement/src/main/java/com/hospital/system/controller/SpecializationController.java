package com.hospital.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.system.model.Specialization;
import com.hospital.system.reprository.SpecializationRepository;
import com.hospital.system.service.SpecializationService;

@Controller
@RequestMapping("/specialization")
public class SpecializationController {
	
	@Autowired
	private SpecializationService speService;
	
	@Autowired
	private SpecializationRepository specialRepo;
	
	@GetMapping("/add")
	public String getSpecialization() {
		
		
		
		return "SpecializationForm";
	}
	
	@PostMapping("/add")
	public String postSpecialization(@ModelAttribute Specialization specialization, Model model) {
		
		speService.addspecialization(specialization);
		
		model.addAttribute("message", "Specialization successfully added!");
		
		return "SpecializationForm";
	}
	
	@GetMapping("/list")
	public String getAllSpecialization(Model model) {
		
		
		model.addAttribute("specializationList", speService.getAllSpecialization());
		
		
		return "SpecializationList";
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam int id, Model model) {
		
		
		model.addAttribute("SpecialObj", speService.getSpecializationById(id));
		model.addAttribute("message", "Specialization Updated successfully!");
		
		return "SpecializationEdit";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Specialization specialization) {
		
		
		
		speService.addspecialization(specialization);
		
		
		
		return "redirect:/specialization/list";
	}
	
	@GetMapping("/view")
	public String view(@RequestParam int id,Model model) {
		
		model.addAttribute("SpecialObj", specialRepo.findById(id));
		
		return "SpecializationView";
	}

}
