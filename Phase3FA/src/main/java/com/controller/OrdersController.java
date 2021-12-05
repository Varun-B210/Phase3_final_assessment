package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Orders;
import com.service.OrdersService;

@RestController
public class OrdersController {
	
	@Autowired
	OrdersService orService;

	@GetMapping("/orders")
	public List<Orders> listOrders() {
		return orService.findAll();
	}

	@GetMapping("/orders/{userid}")
	public List<Orders> searchOrderByUserid(@PathVariable("userid") int userId) {
		return orService.findByUserId(userId);
	}

	@PostMapping("/orders")
	public void addOrder(@RequestBody Orders newOrder) {
		orService.save(newOrder);

}
}