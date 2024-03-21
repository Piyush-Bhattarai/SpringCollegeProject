package com.springproject.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.model.Product;
import com.springproject.repository.ProductRepository;
import com.springproject.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productrepo;

	@Override
	public void addproduct(Product product) {

		productrepo.save(product);
		
	}

	@Override
	public List<Product> getAllproduct() {
	
		return productrepo.findAll();
		
	}

}
