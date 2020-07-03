package zaj08_03_ver2.Typy_generyczne;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a=1;
        int b=2;
        float af=1;
        float bf=31;
        long al=2313;
        long bl=213123;

        System.out.println(calc.add(a, b));
        System.out.println(calc.add(af, bf));
        System.out.println(calc.add(al, bl));
        System.out.println(calc.subtract(al, bl));
        System.out.println(calc.multiply(al, bl));
        System.out.println(calc.divide(al,bl));
    }
}
