package com.springproject.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.model.Category;
import com.springproject.repository.CategoryRepository;
import com.springproject.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository crepo;
	

	@Override
	public void addcategory(Category category) {
		
		crepo.save(category);
		
	}

		

	@Override
	public List<Category> getcategory() {
		
		return crepo.findAll();
	}
}
