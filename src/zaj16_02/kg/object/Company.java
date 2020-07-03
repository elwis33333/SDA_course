package zaj16_02.kg.object;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Company {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();
//        System.out.println(scanner.nextInt());

        Time time = new Time("14 h 20 min");
        System.out.println(time.toString());
        Time time1 = time.add(new Time(5,51));
        System.out.println(time1.toString());
        Time time2 = time1.sub(time);
        System.out.println(time2.toString());
        Time time3 = time2.multiply(6);{
            System.out.println(time3.toString());
        }
//        String[] names = {"Karol","Piotr","Stefan"};
//        String[] lastNames = {"Godlewski", "Burzyński", "Burczymucha"};
//        int[] ages = {10,20,30};
//        ArrayList<Employee> employeeArrayList = new ArrayList<>();
//
//        for (int i = 0; i < names.length; i++) {
//            Employee employee1 = new Employee(names[i], lastNames[i], ages[i]);
//            employeeArrayList.add(employee1);
//        }
//        System.out.println(employeeArrayList);
    }
}
