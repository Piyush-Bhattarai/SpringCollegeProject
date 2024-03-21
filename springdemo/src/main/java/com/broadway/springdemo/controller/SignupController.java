package com.broadway.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.broadway.springdemo.model.User;
import com.broadway.springdemo.reprository.UserRepository;

@Controller
public class SignupController {
	
	@Autowired
	private UserRepository UserRepo;

	@GetMapping("/signup")
	public String getSignup() {

		return "SignupForm";
	}

	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user) {

		UserRepo.save(user);
		
		return "LoginForm";
	}
}
