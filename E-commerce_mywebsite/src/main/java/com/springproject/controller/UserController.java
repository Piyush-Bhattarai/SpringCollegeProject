package com.springproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springproject.model.Product;
import com.springproject.model.User;
import com.springproject.service.CategoryService;
import com.springproject.service.UserService;
import com.springproject.service.productService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/Insta-deals")
public class UserController {
	
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private productService productservice;
	
	@Autowired
	private CategoryService catservice;
	
	@GetMapping("/login")
	public String getlogin(Model model) {
		
		
		
		return "LoginPage";
	}
	
	@PostMapping("/login")
	public String postlogin(@ModelAttribute User user, Model model, HttpSession session, Product product, String keyword) {
		
	User usr = userservice.login(user.getEmail(), user.getPassword());
	
	if(usr == null) {
		
		model.addAttribute("messageClass", "bounce-animation");
		model.addAttribute("message", "user not found!");
		
		return "LoginPage";
	}
	
		
		session.setAttribute("validuser", usr);
	    model.addAttribute("name", user.getName());
	    
	    model.addAttribute("Categorylist", catservice.getallcategory());
	    
//	    keyword = "Test";
	    
	    model.addAttribute("allproducts", productservice.getallproduct());
	    
	    model.addAttribute("totalproducts", productservice.totalnumberproduct());
	    
		model.addAttribute("finalprice", productservice.calculatefinalprice(product));

	    
		return "index";
	}
	
	@GetMapping("/signup")
	public String getSignup() {


		
		return "SignupPage";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user, RedirectAttributes redirectAttributes, Model model) {
		
		User checkemail = userservice.checkemail(user.getEmail());
		
		System.out.println("check email" + checkemail);
		
		if(checkemail != null) {
			
			redirectAttributes.addFlashAttribute("emailmessage", "Email is already in use!");
			
			
			
			return "redirect:/Insta-deals/signup";
		}
		
		userservice.signup(user);
		
		redirectAttributes.addFlashAttribute("successMessage", "Account created successfully!");
		  
		
		return "redirect:/Insta-deals/login";
	}
//	
//	@GetMapping("/currentpassword")
//	public String getchangepassword(@ModelAttribute User user, @RequestParam int id, Model model) {
//		
//		
//          model.addAttribute(userservice.getuserbyid(id));
//		
//		return "currentpasswordform";
//	}
//	
//	@PostMapping("/currentpassword")
//	public String postchangepassword(Model model, @ModelAttribute User user, HttpSession session, RedirectAttributes redirect){
//		
//		User checkpsw = userservice.checkpassword(user.getPassword());
//		
//		System.out.println(checkpsw);
//		
//		if(checkpsw == null) {
//			
//			
//			model.addAttribute("passwordmessage", "password doesnot match");
//			
//			return "currentpasswordform";
//		}
//		
//		
//		
//		return "changepasswordform";
//		
//	}
//	
//	
//	@PostMapping("/changepassword")
//	public String postchangepassword(@RequestParam int id, @ModelAttribute User user, RedirectAttributes redirect) {
//		
//		
//		userservice.updatepassword(user);
//		
//		redirect.addFlashAttribute("passwordchangemessage","Password changed successfully!");
//		
//		return "redirect:/Insta-deals/login";
//	}
//	
	
	
	@GetMapping("/userlogout")
	public String userlogout(HttpSession session, RedirectAttributes redirect) {
		
		session.invalidate();
		
		return "redirect:/Insta-deals/login";
	}
	
}
