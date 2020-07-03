package zaj08_03.Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad6 {

    public static void main(String[] args) {
        List<Double> tree = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Podaj liczbę");
            String c = scanner.next();
            if(c.equals("-")) break;
            tree.add(Double.parseDouble(c)/(tree.size()+1));
        }
        System.out.println(tree);
    }
}
