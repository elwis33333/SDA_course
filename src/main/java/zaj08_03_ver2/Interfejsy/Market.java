package zaj08_03_ver2.Interfejsy;

public class Market {
    public static void main(String[] args) {
        Employer employer = new Employer("Adam","Nowak","Bayern");

        System.out.println(employer);

        Employee employee = new Employee("Robert", "Lewandowski", employer, 1500.90);
        System.out.println(employee);
    }
}
