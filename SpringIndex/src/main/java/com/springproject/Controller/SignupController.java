package com.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springproject.Repository.UserRepo;
import com.springproject.model.User;

@Controller
public class SignupController {
	
	@Autowired
	private UserRepo userrepo;
	
	@GetMapping("/signup")
	public String getSignup() {
		
		
		
		return "signup";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user, Model model) {
		
		userrepo.save(user);
		
		
		return "Login";
	}

}
