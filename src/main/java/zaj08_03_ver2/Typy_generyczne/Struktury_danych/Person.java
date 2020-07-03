package zaj08_03_ver2.Typy_generyczne.Struktury_danych;

public class Person implements Comparable<Person>{
    String name;
    String surname;
    Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //a
//    @Override
//    public int compareTo(Person p) {
//        return this.age-p.age;
//    }

    //b
//    @Override
//    public int compareTo(Person p) {
//        return this.surname.compareTo(p.surname);
//    }

    //c
//    @Override
//    public int compareTo(Person p) {
//        if(this.surname.compareTo(p.surname)==0){
//            return this.name.compareTo(p.name);
//        }
//        else{
//            return this.surname.compareTo(p.surname);
//        }
//    }

    //d
    @Override
    public int compareTo(Person p) {
        if(this.surname.compareTo(p.surname)==0){
            if(this.name.compareTo(p.name)==0){
                return this.age-p.age;
            }
            else {
                return this.name.compareTo(p.name);
            }
        }
        else{
            return this.surname.compareTo(p.surname);
        }
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
