package zaj18_04_and_05_04_Patterns.singleton;

public class SingletonObjectEager {

    private static final SingletonObjectEager MySingleton =
            new SingletonObjectEager();

    private SingletonObjectEager() {
    }

    public static SingletonObjectEager getInstance() {
        return MySingleton;
    }

    public void calculate() {
        System.out.println(this.getClass().getSimpleName());
    }
}
