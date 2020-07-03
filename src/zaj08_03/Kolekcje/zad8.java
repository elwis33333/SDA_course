package zaj08_03.Kolekcje;

import java.util.*;

public class zad8 {
    public static void main(String[] args) {
        Map<String, String> tree = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Podaj pierwszą osobę");
            String c = scanner.next();
            if(c.equals("-")) break;
            System.out.println("Podaj drugą osobę osobę");
            String c2 = scanner.next();
            if(c2.equals("-")) break;
            tree.put(c,c2);
        }
        System.out.println(tree);
    }

}
