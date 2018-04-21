package com.devon.jds.behavioral.command;

public class OpenFileCommand implements Command {

	@Override
	public void execute() {
		this.fileSystem.openFile();
	}
	private FileSystemReciever fileSystem;
	public OpenFileCommand(FileSystemReciever fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}
	
	
}
