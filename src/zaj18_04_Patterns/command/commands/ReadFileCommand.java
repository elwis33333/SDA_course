package zaj18_04_Patterns.command.commands;


import zaj18_04_Patterns.command.fs.FileSystemReceiver;

public class ReadFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public ReadFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    public void execute() {
        this.fileSystem.readFile();
    }

}
