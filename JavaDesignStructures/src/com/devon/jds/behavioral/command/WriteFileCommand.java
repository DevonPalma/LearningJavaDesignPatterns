package com.devon.jds.behavioral.command;

public class WriteFileCommand implements Command {
	private FileSystemReciever fileSystem;

	@Override
	public void execute() {
		this.fileSystem.writeFile();
	}

	public WriteFileCommand(FileSystemReciever fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}
	
	
}
