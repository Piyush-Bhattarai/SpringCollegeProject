package com.springproject.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.springproject.model.Category;
import com.springproject.model.Product;
import com.springproject.service.CategoryService;
import com.springproject.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@Autowired
	private CategoryService cservice;
	
	
	@GetMapping("/product")
	public String getproduct(Model model) {
		
		List<Category> categorylist = cservice.getcategory();
		model.addAttribute("Categorylist", categorylist);
		
		
		return "AddProduct";
	}
	
	@PostMapping("/product")
	public String postproduct(@ModelAttribute Product product,@RequestParam MultipartFile photo, Model model) {
		
		if(!photo.isEmpty()) {
			
			product.setImage(photo.getOriginalFilename());
			
			try {
				Files.copy(photo.getInputStream(), Path.of("src/main/resources/static/productimage/" + photo.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			productservice.addproduct(product);
			
			
			
			return "ProductListPage";
		}
		return "AddProduct";
	}
		

}
