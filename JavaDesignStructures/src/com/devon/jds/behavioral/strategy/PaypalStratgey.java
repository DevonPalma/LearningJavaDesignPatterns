package com.devon.jds.behavioral.strategy;

public class PaypalStratgey implements PaymentStrategy {

	private String emailId;
	private String password;
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using paypal");
	}

	public PaypalStratgey(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

}
