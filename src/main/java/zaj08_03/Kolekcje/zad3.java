package zaj08_03.Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ciągu fibonacciego");
        int length = scanner.nextInt();
        List<Long> fibonacci = new ArrayList<>(length);
        long first=0, second=1, sum=0;
        fibonacci.add(first);
        fibonacci.add(second);
        for (int i = 2; i < length; i++) {
            sum=first+second;
            fibonacci.add(sum);
            first=second;
            second=sum;
        }
        System.out.println(fibonacci);
    }

}
