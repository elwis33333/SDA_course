package zaj08_03_ver2.Interfejsy;

//owa klasa dziedziczy po Person i implementuje interfejs IEmployee
public class Employee extends Person implements IEmployee {
    Employer employer; //kompozycja
    double salary;

    public Employee(String firstName, String lastName, Employer employer, double salary) {
        super(firstName, lastName);
        this.employer = employer;
        this.salary = salary;
    }

    @Override
    public Employer getEmployer(){
        return employer;
    }

    @Override
    public double calcSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employer=" + employer +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
