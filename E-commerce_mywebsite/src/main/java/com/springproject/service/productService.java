package com.springproject.service;

import java.util.List;

import com.springproject.model.Product;

public interface productService {
	
	 void addproduct(Product product);
	 
	 List<Product> getallproduct();

	 int totalnumberproduct();
	 
	 Product getproductbyid(int id);
	 
	 void updateproduct(Product product);
	 
	 Double calculatefinalprice(Product product);
	 
	 int calculatediscountrate(Product product);
	 
	 void deleteproduct(int id);
	 
	 

	 
}
