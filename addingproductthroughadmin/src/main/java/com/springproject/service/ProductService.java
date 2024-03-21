package com.springproject.service;

import java.util.List;

import com.springproject.model.Product;

public interface ProductService {
	
	void addproduct(Product product);
	
	List<Product>  getAllproduct();

}
