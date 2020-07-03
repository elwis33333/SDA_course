package zaj18_04_Patterns.command.commands;


import zaj18_04_Patterns.command.fs.FileSystemReceiver;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    public void execute() {
        //open pattern.command is forwarding request to openFile method
        this.fileSystem.openFile();
    }

}
