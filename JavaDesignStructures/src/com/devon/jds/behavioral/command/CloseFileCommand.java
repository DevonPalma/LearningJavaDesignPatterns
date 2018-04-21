package com.devon.jds.behavioral.command;

public class CloseFileCommand implements Command {

	private FileSystemReciever fileSystem;
	
	public CloseFileCommand(FileSystemReciever fileSystem) {
		this.fileSystem = fileSystem;
	}
	
	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}

}
