package zaj18_04_and_05_04_Patterns.factory;

public class NoneReport implements Report {

    @Override
    public void print() {
        System.out.println("Not supported");
    }
}
