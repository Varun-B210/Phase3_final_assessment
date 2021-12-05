package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repository.ProductRepository;
import com.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository pr;
	
	public void save(Product product) {
		pr.save(product);
		
	}
	public List<Product> getProducts() {
		return pr.findAll();
	}

	public List<Product> findByName(String productname) {
		// TODO Auto-generated method stub
		return pr.findByName(productname);
	}
	
	

}
