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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springproject.model.Category;
import com.springproject.model.Product;
import com.springproject.service.CategoryService;
import com.springproject.service.productService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/Insta-deals")
public class ProductController {

	@Autowired
	private productService productservice;

	@Autowired
	private CategoryService catservice;				

	@GetMapping("/addproduct")
	public String product(Model model, HttpSession session) {

		if (session.getAttribute("validadmin") == null) {

			
			return "AdminLoginPage";
		}
    	
	 	model.addAttribute("totalproducts", productservice.totalnumberproduct());
	 	
		model.addAttribute("totalcategories", catservice.countcategory());


		return "AdminDashboardPage";
	}
	
	

	@PostMapping("/addproduct")
	
	public String addProduct(@RequestParam MultipartFile productphoto, Model model, @ModelAttribute Product product, HttpSession session, RedirectAttributes redirect) {
		
        if(session.getAttribute("validadmin") == null) {
			
        	
			return "AdminLoginPage";
		}

		if (!productphoto.isEmpty()) {

			product.setProductimage(productphoto.getOriginalFilename());

			try {
				Files.copy(productphoto.getInputStream(),
						Path.of("src/main/resources/static/productimage/" + productphoto.getOriginalFilename()),
						StandardCopyOption.REPLACE_EXISTING);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			productservice.addproduct(product);

			// Redirect to the appropriate page after successful product addition
		 	model.addAttribute("totalproducts", productservice.totalnumberproduct());
		 	
			model.addAttribute("totalcategories", catservice.countcategory());


			return "redirect:/Insta-deals/addproduct";

		}
		
		model.addAttribute("errormessage", "Upload failed!, Please try again");
		
		return "redirect:/Insta-deals/addproduct";
	}

}
