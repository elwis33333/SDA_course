package zaj07_03_BookAnalysysWithRegex;

public class Person implements Comparable<Person>{
    String name;
    String surname;
    Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", \t\t surname='" + surname + '\'' +
                ", \t\tage=" + age +
                '}';
    }
//rozw do zad A
    /*
    @Override
    public int compareTo(Person o) {
        return (this.age-o.age);
    }*/
    //rozw do zad A
//rozw zad B
    /*
    @Override
    public int compareTo(Person o) {
        return (this.surname.compareTo(o.surname));
    }*/
@Override
public int compareTo(Person o) {
    return this.surname.compareTo(o.surname)!=0 ? this.surname.compareTo(o.surname): (this.name.compareTo(o.name)!=0 ? this.name.compareTo(o.name):this.age-o.age);
}
}
