package com.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springproject.model.User;
import com.springproject.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/login")
	public String getlogin() {
		
		
		return "LoginForm";
	}
	@PostMapping("/login")
	public String postlogin(@ModelAttribute User user, Model model) {
		
		
		 User usr = userservice.login(user.getUsername(), user.getPassword());
		 
		 if( usr!= null ) {
			 
			 
			 return "home";
			 
		 }
		 model.addAttribute("message", "User doesnot found!");
		 return "LoginForm";
		
		
	}
	
	@GetMapping("/signup")
	public String getsignup() {
		
		
		return "SignupForm";
	}
	
	@PostMapping("/signup")
	public String postsignup(@ModelAttribute User user) {
		
		userservice.signup(user);
		
		return "LoginForm";
	}

}
