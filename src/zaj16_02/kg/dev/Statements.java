package zaj16_02.kg.dev;

import java.util.Random;
import java.util.Scanner;


public class Statements {
    public static void main(String[] args) {

//        random();
        pesel();
        reverse2();
//        fibonacci(n);
//        System.out.println(fib(n));
//        tree(n);
    }

    static void random() {
        Scanner scanner = new Scanner(System.in);
        long num = new Random().nextLong();
        System.out.println(num);
        System.out.println("Wskaż liczbę");
        boolean run = true;
        while (run == true) {
            long n = scanner.nextLong();
            if (n > num) {
                System.out.println("too high!");
            } else if (n < num) {
                System.out.println("Too low");
            } else {
                System.out.println("Zgadleś");
                run = false;
            }
        }
    }

    static void tree(int n) {
        int maxN = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            int maxI = 2 * i - 1;
            for (int j = 0; j < (maxN - maxI) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < maxI; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i < n; i++) {
                b = a + b;
                a = b - a;
            }
        }
        System.out.println(b);
    }

    public static int fib(int n) {
        if ((n == 1) || (n == 2))
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    static void helloWorld() {
        boolean run = true;
        while (run) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Put a number");
            int number = scanner.nextInt();
            if (number > 0) {
                for (int i = 0; i < number; i++) {
                    System.out.println("Hello World");
                }
            } else {
                run = false;
            }
        }
    }

    static void reverse(){
        int n = 123_123_123;
        int reverse = 0;
        while(n!=0){
            reverse=reverse*10;
            reverse=reverse+n%10;
            n=n/10;
        }
        System.out.println(reverse);
    }

    static void reverse2(){
        Integer n =1231421;
        String nw = Integer.toString(n);
        char[] array = nw.toCharArray();
        for (int i =array.length-1;i>=0;i--){
            System.out.print(array[i]);
        }
    }
    static void pesel(){

                String pesel = "123114235235";
                int c1 = pesel.charAt(0) - 48;
                int c2 = pesel.charAt(1) - 48;
                int c3 = pesel.charAt(2) - 48;
                int c4 = pesel.charAt(3) - 48;
                int c5 = pesel.charAt(4) - 48;
                int c6 = pesel.charAt(5) - 48;
                int c7 = pesel.charAt(6) - 48;
                int c8 = pesel.charAt(7) - 48;
                int c9 = pesel.charAt(8) - 48;
                int c10 = pesel.charAt(9) - 48;
                int c11 = pesel.charAt(10) - 48;
                int sum = 9 * c1 + 7 * c2 + 3 * c3 + c4 + 9 * c5 + 7 * c6 +
                        3 * c7 + c8 + 9 * c9 + 7 * c10;
                int control = sum % 10;
                if (control == c11) {
                    System.out.println("Twój pesel jest poprawny");
                } else {
                    System.out.println("Twój pesel nie jest poprawny");
                }
            }

}
