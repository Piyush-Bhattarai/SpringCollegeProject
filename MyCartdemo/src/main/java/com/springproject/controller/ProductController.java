package com.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.springproject.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@GetMapping("/index")
	public String getindex() {
		
		
		
		return "index";
	}
	
}
