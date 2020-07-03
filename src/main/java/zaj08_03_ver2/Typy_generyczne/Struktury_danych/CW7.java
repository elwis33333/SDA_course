package zaj08_03_ver2.Typy_generyczne.Struktury_danych;

import java.util.*;

public class CW7 {
    public static void main(String[] args) {

        Set<Double> doubleSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        double num;
        System.out.println("Start writing:");
        String str = scanner.nextLine(); //pobranie tekstu od uzytkownika

        //petla dziala dopoki uzytkownik nie wprowadzi "-" lub nic
        while(!str.equals("-")&&!str.isEmpty()){
            num=Double.parseDouble(str); //proba zamiany na double
            doubleSet.add(num); //dodanie do listy
            str = scanner.nextLine(); //pobranie tekstu od uzytkownika
        }

        System.out.println(doubleSet);
    }
}
