package com.techelevator;

import java.math.BigDecimal;

public class Product {
	 
	private String type;
	private String name;
	private BigDecimal price;
	private int quantity;
	
	
	public Product(String type, String name, BigDecimal price, int quantity) {
		
		this.type = type;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}


	public String getType() {
		return type;
	}


	public String getName() {
		return name;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public int getQuantity() {
		return quantity;
	}
	
	
	

}
