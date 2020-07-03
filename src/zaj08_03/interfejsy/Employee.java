package zaj08_03.interfejsy;

public class Employee extends Person implements IEmployee {

    public Employer employer;
    public double salary;

    public Employee(String name, String surname, Employer employer, double salary) {
        super(name, surname);
        this.employer=employer;
        this.salary=salary;
    }

    @Override
    public Employer getEmployer() {
        return this.employer;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}
