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

import com.springproject.model.Admin;
import com.springproject.model.Product;
import com.springproject.repository.AdminRepository;
import com.springproject.service.AdminService;
import com.springproject.service.CategoryService;
import com.springproject.service.UserService;
import com.springproject.service.productService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/Insta-deals")

public class Admincontroller {

	@Autowired
	private AdminRepository adminrepo;

	@Autowired
	private AdminService adminservice;

	@Autowired
	private productService productservice;

	@Autowired
	private CategoryService catservice;

	@Autowired
	private UserService userservice;

	@GetMapping("AdminLogin")
	public String getAdminlogin(Model model, HttpSession session) {

		if (model.containsAttribute("successMessage")) {
			model.addAttribute("successMessage", model.getAttribute("successMessage"));

		}
		model.addAttribute("Categorylist", catservice.getallcategory());

		return "AdminLoginPage";

	}

	@PostMapping("AdminLogin")
	public String postAdminlogin(@ModelAttribute Admin admin, Model model, HttpSession session) {

		Admin adm = adminservice.login(admin.getAdminemail(), admin.getAdminpassword());

		if (adm == null) {

			model.addAttribute("adminerror", "Create an seller account first!");

			return "AdminLoginPage";
		}

		session.setAttribute("validadmin", adm);

		return "redirect:/Insta-deals/admindashboard";
	}

	@GetMapping("/AdminSignup")
	public String getAdminsignup(HttpSession session, Model model) {

		model.addAttribute("Categorylist", catservice.getallcategory());

		return "AdminSignupPage";
	}

	@PostMapping("/AdminSignup")
	public String postAdminsignup(@ModelAttribute Admin admin, Model model, RedirectAttributes redirectAttributes) {

		Admin adm = adminservice.checkemail(admin.getAdminemail());

		if (adm != null) {

			redirectAttributes.addFlashAttribute("emailmessage", "Email is already in use!");

			return "redirect:/Insta-deals/AdminSignup";

		}
		adminrepo.save(admin);
		redirectAttributes.addFlashAttribute("successMessage", "Account created successfully!");

		return "redirect:/Insta-deals/AdminLogin";
	}

	@GetMapping("/admindashboard")
	public String getdashboard(HttpSession session, Model model) {
		
		if(session.getAttribute("validadmin") == null) {
			
			
			return "AdminLoginPage";
		}
		

		model.addAttribute("totalproducts", productservice.totalnumberproduct());

		model.addAttribute("totalcategories", catservice.countcategory());

		model.addAttribute("totaluser", userservice.countuser());

		return "AdminDashboardPage";

	}

	@GetMapping("/logout")
	public String logout(RedirectAttributes redirect, Model model, Product product, HttpSession session) {
		
		
		session.invalidate();


		return "redirect:/Insta-deals/index";
	}

	
}
