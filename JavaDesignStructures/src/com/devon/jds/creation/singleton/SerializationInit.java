package com.devon.jds.creation.singleton;

import java.io.Serializable;

public class SerializationInit implements Serializable {

	private static final long serialVersionUID = 8518481928668160984L;
	
	private SerializationInit() {}
	
	private static class SerializationHelper {
		private static final SerializationInit instance = new SerializationInit();
	}
	
	public static SerializationInit getInstance() {
		return SerializationHelper.instance;
	}
}
