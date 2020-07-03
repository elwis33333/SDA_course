package zaj08_03_ver2.Typy_generyczne.Struktury_danych;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CW8 {
    public static void main(String[] args) {
        Map<String,String> partnersMap = new HashMap<>();
        Scanner scn = new Scanner(System.in);
        String person;
        String partner;
        while(true) {
            System.out.println("Write a persons name:");
            person = scn.nextLine();
            if (person.equals("-") || person.isEmpty()){
                break;
            }
            System.out.println("Write this persons partner name:");
            partner = scn.nextLine();
            if (partner.equals("-") || partner.isEmpty()){
                break;
            }
            partnersMap.put(person, partner);
        }
        System.out.println(partnersMap);

        System.out.println("Give name:");
        person=scn.nextLine();

        System.out.println(partnersMap.get(person));
    }
}
