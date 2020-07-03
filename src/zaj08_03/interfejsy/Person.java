package zaj08_03.interfejsy;

public class Person implements IPerson {

    String name;
    String surname;

    @Override
    public String getFirstName() {
        return this.name;
    }

    @Override
    public String getLastName() {
        return this.surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
