package com.service;

import java.util.List;


import com.entity.Product;

public interface ProductService {
	
	void save(Product product);
	List<Product> getProducts();
	List<Product> findByName(String name);
	
}
