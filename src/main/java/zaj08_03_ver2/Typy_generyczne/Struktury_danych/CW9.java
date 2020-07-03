package zaj08_03_ver2.Typy_generyczne.Struktury_danych;

public class CW9 {
    public static void main(String[] args) {
        StackExample stackExample = new StackExample(5);

        stackExample.add(1);
        stackExample.add(2);
        stackExample.add(3);
        stackExample.add(4);
        stackExample.add(5);
//        stackExample.add(6);

//        stackExample.clear();
        System.out.println(stackExample.get());
        System.out.println(stackExample.get());
        System.out.println(stackExample.get());
        System.out.println(stackExample.get());
        System.out.println(stackExample.get());
    }
}
