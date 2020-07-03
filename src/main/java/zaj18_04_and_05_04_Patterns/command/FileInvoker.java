package zaj18_04_and_05_04_Patterns.command;


import zaj18_04_and_05_04_Patterns.command.commands.Command;

public class FileInvoker {

    public Command command;

    public FileInvoker(Command c) {
        this.command = c;
    }

    public void runCommand(Command c) {
        command = c;
        execute();
    }

    public void execute() {
        this.command.execute();
    }

}
