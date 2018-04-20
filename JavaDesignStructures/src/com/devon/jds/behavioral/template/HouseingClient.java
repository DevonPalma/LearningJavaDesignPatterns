package com.devon.jds.behavioral.template;

public class HouseingClient {

	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();
		
		houseType.buildHouse();
		System.out.println("**********");
		
		houseType = new GlassHouse();
		houseType.buildHouse();
	}

}
