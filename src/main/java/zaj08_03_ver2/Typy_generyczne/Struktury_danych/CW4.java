package zaj08_03_ver2.Typy_generyczne.Struktury_danych;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CW4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int[] range = new int[2]; //Przechowuje zakres
        Random rnd = new Random(); //obiekt typu Random

        //Pobranie dlugosci listy od uzytkownika
        System.out.println("Give number of Random Numbers:");
        int n = scanner.nextInt();

        //Pobranie zakresu losowanych liczb od uzytkownika
        System.out.println("Give min value");
        range[0]=scanner.nextInt(); //pobranie wartosci minimalnej
        System.out.println("Give max value");
        range[1]=scanner.nextInt(); //pobranie wartosci maksymalnej

        for(int i=0; i<n; i++){
            //losowanie z roznicy przedzialow powiekszone o 1
            //nastepnie dodaje wartosc minimalna celem dopasowania
            //do pozadanego przedzialu
            list.add(rnd.nextInt(range[1]-range[0]+1)+range[0]);
        }

        System.out.println(list);
    }
}

