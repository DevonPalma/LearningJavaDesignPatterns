package com.devon.jds.design.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape {

	private boolean fill;
	
	public Oval(boolean f) {
		this.fill = f;
		System.out.println("Creating Oval object with fill = " + f);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void draw(Graphics g, int x, int y, int width, int height, Color color) {
		g.setColor(color);
		g.drawOval(x, y, width, height);
		if (fill) {
			g.fillOval(x, y, width, height);
		}
	}

}
