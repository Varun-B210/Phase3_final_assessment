package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Orders;
import com.repository.OrdersRepository;
import com.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService{
	
	@Autowired
	OrdersRepository or;
	
	
	public void save(Orders orders) {
		or.save(orders);		
	}

	public List<Orders> findAll() {
		
		return or.findAll();
	}

	public List<Orders> findByUserId(int UserID) {
		// TODO Auto-generated method stub
		return or.findByUserid();
	}

}
