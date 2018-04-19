package com.devon.jds.creation.singleton;

public class ThreadSafeInit {
	private static ThreadSafeInit instance;
	
	private ThreadSafeInit() {}
	
	public static synchronized ThreadSafeInit getInstace() {
		if (instance == null) {
			instance = new ThreadSafeInit();
		}
		return instance;
	}
}
