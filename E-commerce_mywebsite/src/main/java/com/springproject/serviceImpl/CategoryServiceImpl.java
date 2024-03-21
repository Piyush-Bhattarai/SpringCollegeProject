package com.springproject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springproject.model.Category;
import com.springproject.repository.CategoryRepository;
import com.springproject.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository catrepo;

	@Override
	public void addcategory(@ModelAttribute Category category) {
		
		catrepo.save(category);
		
		
	}

	@Override
	public List<Category> getallcategory() {
		
		return catrepo.findAll();
	}

	@Override
	public int countcategory() {
		
		
		
		return (int) catrepo.count();
	}

	

	
	

}
