package com.devon.jds.creation.singleton;

public class StaticBlockInit {
	private static StaticBlockInit instance;
	
	private StaticBlockInit() {}
	
	static {
		try {
			instance = new StaticBlockInit();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating instance");
		}
	}
	
	public static StaticBlockInit getInstance() {
		return instance;
	}
}
