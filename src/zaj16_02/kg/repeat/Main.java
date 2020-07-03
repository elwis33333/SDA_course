package zaj16_02.kg.repeat;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int[] table = new int[SIZE];
        putIntsToTab(random, table);
        System.out.println(Arrays.toString(table));
//        printTab(table);
//        printTabRevers(table);
//        printTab2(table);
//        printTab3(table);
//        System.out.println(sumAll(table));
//        System.out.println(sumIfNumbersGreaterThanM(table, 10));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");

        printTabScanner(table,scanner.nextInt());
//        System.out.println(sumLastNGreaterThanM(table,5,3));
    }


    private static void putIntsToTab(Random random, int[] table) {
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(10);
        }
    }

    public static void printTab(int[] table) {
        int i;
        for (i = 0; i < table.length - 1; i++) {
            System.out.print(table[i] + ", ");
        }
        System.out.println(table[i]);

    }

    private static void printTabRevers(int[] table) {
        int i;
        for (i = table.length - 1; i > 0; i--) {
            System.out.print(table[i] + ", ");
        }
        System.out.println(table[i]);

    }

    private static void printTab2(int[] table) {
        int i;
        for (i = 1; i < table.length; i += 2) {
            System.out.print(table[i] + ", ");
        }

    }

    private static void printTab3(int[] table) {
        int i;
        for (i = 1; i < table.length; i++) {
            if (table[i] % 3 == 0) {
                System.out.println(table[i]);
            }
        }

    }

    private static void printTabScanner(int[] table, int n) {
        int i;
        for (i = 0; i < table.length; i++) {
            if (table[i] % n == 0) {
                System.out.println(table[i]);
            }
        }

    }

    private static int sumAll(int[] table) {
        int result=0;
        for (int i = 0; i < table.length; i++) {
            result+=table[i];
        }
        return result;

    }

    private static int sumFristNumbers(int[] table, int numbers) {
        int result=0;
        for (int i = 0; i < numbers; i++) {
            result+=table[i];
        }
        return result;
    }

    private static int sumLastNGreaterThanM(int[] table, int numbers, int m) {
        System.out.println(Arrays.toString(table));
        int result=0;
        for (int i = table.length-1; i >= table.length-numbers; i--) {
            if(table[i]>m) {
                result += table[i];
            }
        }
        return result;
    }

    private static int sumIfNumbersGreaterThanM(int[] table, int m) {
        int result=0;

        for (int i = 0; i < table.length; i++) {
            result+=table[i];
            if(result>10)
                return i+1;
        }
        return 0;

    }
}
