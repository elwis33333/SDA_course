package zaj08_03_ver2.Typy_generyczne.Struktury_danych;

import java.util.Arrays;

public class PersonCompareTest {
    public static void main(String[] args) {
        Person[] persons=new Person[6];
        persons[0]=new Person("Zbigniew","Czartoryjski",55);
        persons[1]=new Person("Ania","Nowak",19);
        persons[2]=new Person("Jan","Kowalski",23);
        persons[3]=new Person("Ola","Niemen",3);
        persons[4]=new Person("Bartosz","Nowak",28);
        persons[5]=new Person("Bartosz","Nowak",21);

        Arrays.sort(persons);

        for (Person p: persons){
//            System.out.println(p.name+" "+p.surname+" "+p.age);
            System.out.println(p);
        }

    }
}
