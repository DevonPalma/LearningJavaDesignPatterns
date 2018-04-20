package com.devon.jds.design.composite;

public class Triangle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing triangle with color" + fillColor);
	}

}
