package zaj2;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int num = scn.nextInt();
        int sum = 0;
        int i = 0;
        while (num > 0) {
            i++;
            sum += num;
            System.out.print("Podaj liczbę: ");
            num = scn.nextInt();
        }
        System.out.println("średnia: " + ((sum) / (float) i));
    }

}
