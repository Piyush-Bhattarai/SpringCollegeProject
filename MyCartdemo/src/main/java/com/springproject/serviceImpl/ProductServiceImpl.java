package com.springproject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.model.Product;
import com.springproject.repository.ProductRepository;
import com.springproject.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepo;

	

	@Override
	public void addtocart(Product product) {
		
		productRepo.save(product);
		
	}

	@Override
	public void deletecartitems(int id) {
		
		productRepo.deleteById(id);
		
	}

	@Override
	public List<Product> getcartitems() {
		
		
		return productRepo.findAll();
	}

}
