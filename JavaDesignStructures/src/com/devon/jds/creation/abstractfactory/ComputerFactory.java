package com.devon.jds.creation.abstractfactory;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
