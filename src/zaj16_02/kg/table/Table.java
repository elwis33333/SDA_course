package zaj16_02.kg.table;

import java.util.Arrays;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int[][] a = new int[2][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=a[i].length*i+j;
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

                System.out.println("ZADANIE 1");
        int[] numbers = {1,3,5,10};
        System.out.println("ZADANIE 2");
        System.out.println(Arrays.toString(numbers));
        System.out.println("ZADANIE 3");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("ZADANIE 4");
        for (int i = 0; i < numbers.length; i+=2) {

                    System.out.println(numbers[i]);


        }
        System.out.println("ZADANIE 5");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0){
                System.out.println(numbers[i]);
            }
        }
        System.out.println("ZADANIE 6");
        for (int i = numbers.length-1;i>=0;i--){
            System.out.println(numbers[i]);
        }




        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy");
        int[] numbers2 = new int[scanner.nextInt()];
        int i= 0;
        while (i<numbers2.length) {
            System.out.println("Podaj liczbe");
            numbers2[i]=scanner.nextInt();
            i++;
        }

        i= 0;
        while (i<numbers2.length) {
            System.out.println(numbers2[i++]);
        }
    }
}
