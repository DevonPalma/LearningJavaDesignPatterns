package com.devon.jds.behavioral.strategy;

public class ShoppingCartTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.pay(new PaypalStratgey("test", "boop"));
		cart.pay(new CreditCardStrategy("lloool", "2", "yes", "today"));
	}
}
