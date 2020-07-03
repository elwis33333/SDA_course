package collection_inherience;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zad1 {
    public static void main(String[] args) {
        //1a
        List<Integer> lista1 = new ArrayList<Integer>();
        for (int i = -50; i < 50; i++) {
            lista1.add(i);
        }
        System.out.println(lista1);
//1b
        List<Integer> lista2 = new ArrayList<Integer>();
        for (int i = 0; i < 100; i = i + 2) {
            lista2.add(i);
        }
        System.out.println(lista2);
//1c
        List<Double> lista3 = new ArrayList<Double>();

        for (BigDecimal x = BigDecimal.valueOf(1.3); x.compareTo(BigDecimal.valueOf(5.7)) < 0; x = x.add(BigDecimal.valueOf(0.05))) {
            lista3.add(x.doubleValue());
        }
        System.out.println(lista3);
//1d
        List<Integer> lista4 = new ArrayList<Integer>();
        for (int i = 91; i < 1234; i++) {
            if (i % 3 == 0)
                lista4.add(i);
        }
        System.out.println(lista4);
        //1e
        List<Integer> lista5 = new ArrayList<Integer>();
        for (int i = 1; i < 1000; i++) {
            double pierw = Math.sqrt(i);
            int p = (int) pierw;
            if (pierw == p) lista5.add(i);
        }
        System.out.println(lista5);
        //1f
        List<Integer> lista6 = new ArrayList<Integer>();
        for (int i = 1; i < 10000; i++) {
            int sum = String.valueOf(i)
                    .chars()
                    .map(Character::getNumericValue)
                    .sum();
            if (sum == 21) lista6.add(i);
        }
        System.out.println(lista6);
        //1g
        List<Integer> lista7 = new ArrayList<Integer>();
        for (int n = 1; n < 10000; n++) {
            boolean pierwsza = true;
            for (int i = 2; i * i <= n; i++)
                if (n % i == 0) pierwsza = false;
            if(pierwsza==true) lista7.add(n);
        }
        System.out.println(lista7);
        //zad 3g
        Map<Integer,Character> mapa = new HashMap<>();
        for (int i = 0; i < 255; i++) {
            mapa.put(i,(char)i);
        }
        System.out.println(mapa);

    }
}
