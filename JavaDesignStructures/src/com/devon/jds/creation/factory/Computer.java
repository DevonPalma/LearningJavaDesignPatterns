package com.devon.jds.creation.factory;

public abstract class Computer {
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return String.format("RAM: %s HDD: %s CPU: %s", 
				getRAM(), getHDD(), getCPU());
	}
}
