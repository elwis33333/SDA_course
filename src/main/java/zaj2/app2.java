package zaj2;

import java.sql.SQLOutput;
import java.util.Scanner;


public class app2 {
    public static void main(String[] args) {
        /* Reszta z kwoty*/
        Scanner scn = new Scanner(System.in);
        System.out.print("Podaj kwotę: ");
        int amount = scn.nextInt();
        int fifties = amount / 50; // 111
        int twenties = amount % 50 / 20;
        int tens = amount % 50 % 20 / 10;
        int fives = amount % 50 % 20 % 10 / 5;
        int twos = amount % 50 % 20 % 10 % 5 / 2;
        int ones = amount % 50 % 20 % 10 % 5 % 2;
        System.out.printf("50: %d, 20: %d, 10: %d, 5: %d, 2: %d, 1: %d",
                fifties, twenties, tens, fives, twos, ones);

        //PESEL

        String pesel = "95101811855";
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
        int sum = 9 * c1 + 7 * c2 + 3 * c3 + c4 + 9 * c5 + 7 * c6 + 3 * c7 + c8 + 9 * c9 + 7 * c10;
        int control = sum % 10;
        if (control == c11) {
            System.out.println("Twój pesep jest poprawny");
        } else {
            System.out.println("Twój pesep nie jest poprawny");
        }
        if (c10 % 2 ==1) {
            System.out.println("Mężczyzna");
        } else {
            System.out.println("Kobiety");
        }


         sum=0 ;
        for (int i = 0; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);


        /* tablica w tablicy*/
        int[][] a = new int[5][5];
        for(int i =0;a.length > i;i++){
            a[i][i] = i;
        }
        for(int i =0; a.length > i;i++){
            for(int j =0; a[i].length > j ;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


        int[][] a1 = new int[2][3];
        for (int i = 0; a1.length > i; i++) {
            for (int j = 0; a1[i].length > j; j++) {
                a1[i][j] = i * a1[i].length + j;
            }
        }
            for (int i = 0; a1.length > i; i++) {
                for (int j = 0; a1[i].length > j; j++) {
                    System.out.print(a1[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
