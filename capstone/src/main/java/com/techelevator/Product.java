package com.techelevator;

import java.math.BigDecimal;

public class Product {
	 
	private String type;
	private String name;
	private BigDecimal price;
	private int quantity;
	private String slotId;
	
	
	public Product(String slotId, String type, String name, BigDecimal price, int quantity) {
		
		this.slotId = slotId;
		this.type = type;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		
	}
	
	public String getSlotId() {
		return slotId;
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
