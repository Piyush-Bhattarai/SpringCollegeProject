package com.springproject.service;

import java.util.List;

import com.springproject.model.Product;

public interface ProductService {
	
	void addtocart(Product product);
	
	void deletecartitems(int id);
	
	List<Product> getcartitems();

}
