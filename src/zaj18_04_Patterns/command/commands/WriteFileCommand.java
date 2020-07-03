package zaj18_04_Patterns.command.commands;


import zaj18_04_Patterns.command.fs.FileSystemReceiver;

public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    public void execute() {
        this.fileSystem.writeFile();
    }

}
