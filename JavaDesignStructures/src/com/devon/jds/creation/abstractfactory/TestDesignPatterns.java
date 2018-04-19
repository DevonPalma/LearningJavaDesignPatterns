package com.devon.jds.creation.abstractfactory;

public class TestDesignPatterns {
	public static void main(String[] args) {
		testAbstractFactory();
	}
	
	private static void testAbstractFactory() {
		Computer pc = ComputerFactory.getComputer(
				new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(
				new ServerFactory("2 GB", "500 GB", "2.4 GHz"));
		System.out.println("AbstractFactory PC Config::" + pc);
		System.out.print("AbstractFactory Server Config::" + server);
	}
}
