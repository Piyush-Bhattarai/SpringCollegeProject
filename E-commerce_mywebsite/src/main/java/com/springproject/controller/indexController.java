package com.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springproject.model.Product;
import com.springproject.service.CategoryService;
import com.springproject.service.productService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/Insta-deals")
public class indexController {

	@Autowired
	private CategoryService catservice;
	
	@Autowired
	private productService productservice;
	
	@GetMapping("/index")
	public String getindex(HttpSession session, Model model, Product product) {
		
		
		
	
	    model.addAttribute("allproducts", productservice.getallproduct());

		model.addAttribute("Categorylist", catservice.getallcategory());
		
		model.addAttribute("finalprice", productservice.calculatefinalprice(product));

		
		return "index";
	}
	
	
	
	@GetMapping("/productdetails")
	public String getproductdetails(@RequestParam int id, Model model) {
		
		 Product product = productservice.getproductbyid(id);
		
		model.addAttribute("prodObj",product);
		
		model.addAttribute("finalprice", productservice.calculatefinalprice(product));
		
		model.addAttribute("discountrate", productservice.calculatediscountrate(product));
		
		
		return "ProductDetails";
	}

}
