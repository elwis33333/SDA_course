package zaj18_04_and_05_04_Patterns.command.commands;


import zaj18_04_and_05_04_Patterns.command.fs.FileSystemReceiver;

public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    public void execute() {
        this.fileSystem.closeFile();
    }

}
