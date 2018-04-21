package com.devon.jds.behavioral.command;

public class FileSystemClient {
	public static void main(String[] args) {
		FileSystemReciever fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
		
		OpenFileCommand cmdOpen = new OpenFileCommand(fs);
		
		new FileInvoker(new OpenFileCommand(fs)).execute();
		
		new FileInvoker(new WriteFileCommand(fs)).execute();
		
		new FileInvoker(new CloseFileCommand(fs)).execute();
	}
}
