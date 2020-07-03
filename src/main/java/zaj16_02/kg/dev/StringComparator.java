package zaj16_02.kg.dev;

public class StringComparator {

    //This is the main method
    public static void main(String[] args) {

        String s1 = "dad1";
        String s2 = "dad2";
        String s3 = "dad3";
        System.out.printf("%s %s %s %n", s1, s2, s3);

        System.out.println(Integer.toHexString(25));
        System.out.printf("%x%n", 25);

        System.out.println(3==3&&3==4);
        System.out.println(3!=5||3==5);
        System.out.println((2+4)>(1+3));
        System.out.println("cos".equals("cos"));
        System.out.println("cos"=="cos");
        String zmienna1 = "cos";
        String zmienna3 = new String("cos");
        String zmienna4 = new String("cos");
        String zmienna2 = "cos";
        System.out.println(zmienna1==zmienna2);
        System.out.println(System.identityHashCode(zmienna3));
        System.out.println(System.identityHashCode(zmienna4));
        System.out.println(System.identityHashCode(zmienna2));
        System.out.println(System.identityHashCode(zmienna1));
        System.out.println(zmienna3 == zmienna4);


    }

}
