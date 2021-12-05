package com.service;

import java.util.List;

import com.entity.Category;

public interface CategoryService {
	
void save (Category category);
List<Category> findAll();
Category findById(long id);
void delete(long id);

}
