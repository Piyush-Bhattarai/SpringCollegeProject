package com.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springproject.model.Category;
import com.springproject.service.CategoryService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/Insta-deals")
public class Categorycontroller {

	@Autowired
	private CategoryService catservice;

	@PostMapping("/addcategory")
	public String addcategory(@ModelAttribute Category category, HttpSession session, Model model,
			RedirectAttributes redirect) {

		if(session.getAttribute("validadmin") == null) {
			
			
			return "AdminLoginPage";
			
		}

		catservice.addcategory(category);

		redirect.addFlashAttribute("successmessage", "Category added successfully!");

		return "redirect:/Insta-deals/admindashboard";
	}

}
