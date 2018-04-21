package com.devon.jds.behavioral.command;

public class FileSystemReceiverUtil {
	public static FileSystemReciever getUnderlyingFileSystem() {
		String os = System.getProperty("os.name");
		System.out.println("Underlying OS is: " + os);
		if (os.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		} else {
			return new UnixFileSystemReceiver();
		}
	}
}
