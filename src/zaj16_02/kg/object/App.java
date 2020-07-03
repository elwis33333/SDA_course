package zaj16_02.kg.object;

public class App {

    public static void main(String[] args) {
        Time time = new Time("14 h 20 min");
        System.out.println(time.toString());
        Time time1 = time.add(new Time(5,51));
        System.out.println(time1.toString());
        Time time2 = time1.sub(time);
        System.out.println(time2.toString());
        Time time3 = time2.multiply(6);
        System.out.println(time3.toString());
        Employee employee = new Employee("Jan",61,5000,11);
        System.out.println(employee.paySalary());
        Account account = new Account(1000);
        System.out.println(account.getBalance());

    }
}
