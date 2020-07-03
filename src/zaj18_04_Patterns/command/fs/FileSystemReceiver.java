package zaj18_04_Patterns.command.fs;

public interface FileSystemReceiver {

    void openFile();

    void writeFile();

    void closeFile();

    void readFile();

}
