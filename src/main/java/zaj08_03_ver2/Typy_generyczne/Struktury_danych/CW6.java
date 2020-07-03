package zaj08_03_ver2.Typy_generyczne.Struktury_danych;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CW6 {
    public static void main(String[] args) {

        List<Double> doubleList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        double num;
        int n=1; //zaczynamy od 1 zeby nie dzielic przez 0
        System.out.println("Start writing:");
        String str = scanner.nextLine(); //pobranie tekstu od uzytkownika

        //petla dziala dopoki uzytkownik nie wprowadzi "-" lub nic
        while(!str.equals("-")&&!str.isEmpty()){
            num=Double.parseDouble(str); //proba zamiany na double
            doubleList.add(num/n); //dodanie do listy
            n++; //n=n+1;
            str = scanner.nextLine(); //pobranie tekstu od uzytkownika
        }

        System.out.println(doubleList);
    }
}
