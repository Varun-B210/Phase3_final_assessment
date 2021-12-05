package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int userId;
	private int qty;
	private int productId;
	private Date date;
	
	public Orders(int id, int userId, int qty, int productId, Date date) {
		super();
		this.id = id;
		this.userId = userId;
		this.qty = qty;
		this.productId = productId;
		this.date = date;
	}
	
	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", qty=" + qty + ", productId=" + productId + "]";
	}
	
	
	

}
