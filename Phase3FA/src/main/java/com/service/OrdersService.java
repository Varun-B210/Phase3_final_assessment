package com.service;

import java.util.List;

import com.entity.Orders;

public interface OrdersService {
	
	void save(Orders orders);
	List<Orders> findAll();
	List<Orders> findByUserId(int UserID);
	
}
