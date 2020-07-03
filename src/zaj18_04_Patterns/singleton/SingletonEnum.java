package zaj18_04_Patterns.singleton;

public enum SingletonEnum {

    GET_INSTANCE;

    public void calculate() {
        System.out.println(this.getClass().getSimpleName());
    }
}
