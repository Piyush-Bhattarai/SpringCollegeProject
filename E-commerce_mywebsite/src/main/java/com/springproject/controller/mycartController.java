package com.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springproject.service.productService;

@Controller
public class mycartController {
	
	@Autowired
	private productService productservice;
	
	@GetMapping("/mycart")
	public String getmycart(Model model) {
		
		model.addAttribute("allproducts", productservice.getallproduct());
		
		
		return "mycart";
	}

}
