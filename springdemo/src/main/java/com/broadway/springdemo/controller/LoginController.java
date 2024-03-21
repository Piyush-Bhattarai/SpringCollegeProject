package com.broadway.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.broadway.springdemo.model.User;
import com.broadway.springdemo.reprository.UserRepository;

@Controller
public class LoginController {
	
	@Autowired
	private UserRepository UserRepo;

	@GetMapping("/login")
	public String getLogin() {

		return "LoginForm";
	}

	@PostMapping("/login")
	public String postlogin(@ModelAttribute User user, Model model ) {

		User usr = UserRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		
		if(usr != null) {

			model.addAttribute("uname",user.getUsername());
			return "Home";
		}
		model.addAttribute("message", "user not found");
		return "LoginForm";

	}

}
