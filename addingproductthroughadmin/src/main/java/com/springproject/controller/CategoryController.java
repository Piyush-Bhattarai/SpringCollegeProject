package com.springproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springproject.model.Category;
import com.springproject.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService cservice;
	
	
	@GetMapping("/category")
	public String getcategory() {
		
		
		 
		
		return "Addcategory";
	}
	
	
	
	@PostMapping("/category")
	public String addcategory(@ModelAttribute Category category, Model model) {
		
		
		
		cservice.addcategory(category);
		model.addAttribute("successmessage", "category added successfully!");
		
		
		return "Addcategory";
	}

}
