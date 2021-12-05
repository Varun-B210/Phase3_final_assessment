package com.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Category;
import com.repository.CategoryRepository;
import com.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	
	@Autowired
	CategoryRepository cr;
	
	public void save(Category category) {
		cr.save(category);
	}

	public List<Category> findAll() {
		return cr.findAll();
	}

	public Category findById(long id) {
		Optional<Category> optionalCategory = cr.findById(id);

		if (optionalCategory.isPresent())
			return optionalCategory.get();

		return null;
	}

	public void delete(long id) {
		Optional<Category> optionalCategory = cr.findById(id);

		if (optionalCategory.isPresent())
			cr.delete(optionalCategory.get());		
	}


}
