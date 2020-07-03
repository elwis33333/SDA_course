package zaj08_03.Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkosc listy");
        int length = scanner.nextInt();
        System.out.println("Podaj dolna wartosć przedzialu");
        int down = scanner.nextInt();
        System.out.println("Podaj gorna wartosć przedzialu");
        int high = scanner.nextInt();
        List<Integer> list = new ArrayList<>(length);
        Random random = new Random();
        for (int i = 0; i<  length; i++) {
            list.add(random.nextInt(high-down+1)+down);
        }
        System.out.println(list);
    }
}
