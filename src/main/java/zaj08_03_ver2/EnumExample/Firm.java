package zaj08_03_ver2.EnumExample;

public class Firm {
    Employee[] employees;

    public Firm() {
        employees = new Employee[3];
        employees[0]=new Employee("Zbigniew","Czartoryjski",5500);
        employees[1]=new Employee("Ania","Nowak",1900);
        employees[2]=new Employee("Jan","Kowalski",2300);

    }

    public Integer calculateMonthCosts(){
        Integer costs = 0;

        for (Employee e: employees){
            costs=costs+e.salary;
        }

        return costs;
    }

    public Integer calculateYearCosts(){
        Integer yearCosts=0;
        yearCosts=calculateMonthCosts()*12;
        return yearCosts;
    }

    public Integer calculateFirmCost(Time unitOfTime){
        Integer cost=0;

        switch(unitOfTime){
            case DAY:
                cost=calculateMonthCosts()/30;
                break;
            case MONTH:
                cost=calculateMonthCosts();
                break;
            case YEAR:
                cost=calculateYearCosts();
                break;
            default:
                break;
        }

        return cost;
    }
}
