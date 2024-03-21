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
public class LoginController {
	
	@Autowired
	private UserRepo userrepo;
	
	
	@GetMapping("/login")
	public String getlogin() {
		
		
		return "login";
	}
	
	@PostMapping("/login")
	public String postlogin(@ModelAttribute User user, Model model) {
		
	User usr = userrepo.findByUsernameAndPassword(user.getUsername(),user.getPassword());
		
			if(usr != null) {
				
				
				model.addAttribute("username", user.getUsername());
				return "Home";
				
			}
			model.addAttribute("error", "User not found!");
			return "Login";
				
	}
}
