package com.springproject.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springproject.model.Product;
import com.springproject.repository.ProductRepository;
import com.springproject.service.productService;

@Service
public class ProductServiceImpl implements productService{
	
	@Autowired
	private ProductRepository productrepo;
	
//	@Autowired
//	private Product product;
	
	
	@Override
	public void addproduct(@ModelAttribute Product product) {
		
		productrepo.save(product);
	}


	@Override
	public List<Product> getallproduct() {

		
 
	
		return productrepo.findAll();
	}

	@Override
	public int totalnumberproduct() {
		
		
		return (int) productrepo.count();
		
	}


	@Override
	public Product getproductbyid(int id) {
		
		return productrepo.findById(id).get() ;
	}


	@Override
	public Double calculatefinalprice(Product product) {
	    double finalprice = (product.getProductPrice() - product.getProductDiscount());
	    
	    return finalprice;
	}


	@Override
	public int calculatediscountrate(Product product) {
		
		double discountrate = ((product.getProductDiscount()/ product.getProductPrice()) * 100);
		
		return (int) discountrate;
	}


	@Override
	public void deleteproduct(int id) {

		productrepo.deleteById(id);
	}


	@Override
	public void updateproduct(Product product) {
		
		productrepo.save(product);
		
	}


	
	


	
	
	
	
	
	

}
