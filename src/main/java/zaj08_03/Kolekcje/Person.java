package zaj08_03.Kolekcje;

import java.util.Arrays;

public class Person implements Comparable<Person>{

    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] =  new Person("Karol","Godlewski",25);
        persons[1] = new Person("Piot","Burzyński",26);
        persons[2] = new Person("Piot","Wurzyński",26);
        persons[3] = new Person("Piot","Wurzyński",22);
        persons[4] = new Person("Murzyn","Godlewski",22);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }
        Arrays.sort(persons);
        System.out.println();
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }

    }

    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
//a
//    @Override
//    public int compareTo(Person o) {
//        return this.age-o.age;
//    }
//b
//    @Override
//    public int compareTo(Person o) {
//        return this.name.compareTo(o.name);
//    }
//c
//    @Override
//    public int compareTo(Person o) {
//        return this.surname.compareTo(o.surname);
//    }
//d
//    @Override
//    public int compareTo(Person o) {
//        if(this.surname.equals(o.surname)){
//            return this.name.compareTo(o.name);
//        }
//        return this.surname.compareTo(o.surname);
//    }

    @Override
    public int compareTo(Person o) {
        if(this.surname.equals(o.surname)){
            if(this.name.equals(o.name)) {
               return this.age-o.age;
            }
            return this.name.compareTo(o.name);
        }
        return this.surname.compareTo(o.surname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
