package zaj16_02.kg.sort;

import java.util.Arrays;
import java.util.Random;


public class Sort {

    public static final int SIZE = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int[] table = new int[SIZE];
        putIntsToTab(random, table);
        get2minIntFromTab(table);
//       System.out.println(Arrays.toString(table));
//        long time =System.currentTimeMillis();
//        choiceSort(table);
//        System.out.println(System.currentTimeMillis()-time);
//        long time2 =System.currentTimeMillis();
//        bubbleSort(table);
//        System.out.println(System.currentTimeMillis()-time2);
//        System.out.println(Arrays.toString(table));


    }

    private static void get2minIntFromTab(int[] table) {
        int min = 0;
        int min2 = 0;
        int min3 = 0;
        int[] tab = new int[2];
        for (int i = 0; i < table.length; i++) {
            if (table[i] < table[min]) min = i;
        }

        for (int i = 0; i < table.length; i++) {
            if (table[i] < table[min2]) min3 = i;
            if (min3 != min) min2 = min3;
        }
        tab[0] = table[min];
        tab[1] = table[min2];
        System.out.println(Arrays.toString(table));
        System.out.println(Arrays.toString(tab));
    }

    private static void bubbleSort(int[] table) {
        int var1 = 0;
        int var2 = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                var1 = table[i];
                var2 = table[j];
                if (var1 < var2) {
                    table[j] = var1;
                    table[i] = var2;
                }
            }
        }
    }

    private static void choiceSort(int[] table) {
        int pmin;
        int help;
        for (int i = 0; i < table.length; i++) {
            pmin = i;
            for (int j = i + 1; j < table.length; j++) {
                if (table[j] < table[pmin]) {
                    pmin = j;
                }
            }
            help = table[i];
            table[i] = table[pmin];
            table[pmin] = help;
        }
    }


    private static void putIntsToTab(Random random, int[] table) {
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(100);
        }
    }


}
