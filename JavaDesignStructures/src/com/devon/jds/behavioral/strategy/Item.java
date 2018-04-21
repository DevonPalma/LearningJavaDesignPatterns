package com.devon.jds.behavioral.strategy;

public class Item {
	private String upcCode;
	private int price;
	
	public Item(String upc, int cost) {
		this.upcCode = upc;
		this.price = cost;
	}
	
	public String getUPCCode() {
		return upcCode;
	}
	
	public int getPrice() {
		return price;
	}
}
