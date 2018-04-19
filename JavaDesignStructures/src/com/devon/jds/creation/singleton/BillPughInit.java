package com.devon.jds.creation.singleton;

public class BillPughInit {
	private BillPughInit() {}
	
	private static class BillBughHelper {
		private static final BillPughInit instance = new BillPughInit();
	}
	
	public static BillPughInit getInstace() {
		return BillBughHelper.instance;
	}
}
