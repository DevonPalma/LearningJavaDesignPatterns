package com.devon.jds.design.proxy;

public class ProxyPatternTest {

	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Devon", "boop");
		try {
//			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abd.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}
	}

}
