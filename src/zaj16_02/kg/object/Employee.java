package zaj16_02.kg.object;

public class Employee {

    private String name;
    private int age;
    private int salary;
    private int seniority;

    public Employee(String name, int age, int salary, int seniority) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.seniority = seniority;
    }

    public float paySalary(){
        float salary=this.salary;
        if(this.seniority>15){
            salary+=0.15*this.salary;;
        }
        else if(this.seniority>10){
            salary+=0.1*this.salary;;
        }
        else if(this.seniority>5){
            salary+=0.05*this.salary;;
        }
        if(this.age>60){
            salary+=0.1*this.salary;;
        }
        else if(this.age>50){
            salary+=0.5*this.salary;;
        }
        return salary;
    }
}
