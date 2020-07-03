package zaj16_02.kg.calculation;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a liczbę");
        double a = scanner.nextInt();
        System.out.println("Podaj b liczbę");
        double b = scanner.nextInt();
        System.out.println("Podaj c liczbę");
        double c = scanner.nextInt();
        double delta = Math.pow(b,2)-4*a*c;
        if(delta>0){
            double wynik1 = (-b-Math.sqrt(delta))/(2*a);
            double wynik2 = (-b+Math.sqrt(delta))/(2*a);
            System.out.printf("Pierwiastek 1 = %f %nPierwiastek 2 = %f" , wynik1, wynik2 );
        }else if(delta==0){
            double wynik = -b/(2*a);
            System.out.println("Pierwiastek = " + wynik);
        }else{
            System.out.println("Nie ma pierwiastków");
        }
    }
}
