package com.springproject.service;


import java.util.List;

import com.springproject.model.Category;


public interface CategoryService {
	
	void addcategory(Category category);
	
	List<Category> getcategory();
	

}
