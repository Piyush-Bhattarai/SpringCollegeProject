package com.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springproject.service.Adminservice;


@Controller
@RequestMapping("/index.html")
public class AdminController {
	
	@Autowired
	private Adminservice adminservice;
	
	
	@PostMapping("saveinfo")
	private String saveinfo() {
		
		
		
		return "index";
		
		
		
		
		
		
	}

}
