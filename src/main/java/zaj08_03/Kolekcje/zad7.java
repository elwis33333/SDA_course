package zaj08_03.Kolekcje;

import java.util.*;

public class zad7 {
    public static void main(String[] args) {
        Set<Double> tree = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Podaj liczbę");
            String c = scanner.next();
            if(c.equals("-")) break;
            tree.add(Double.parseDouble(c));
        }
        System.out.println(tree.size());
    }

}
