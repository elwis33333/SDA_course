package zaj08_03_ver2.Interfejsy;

public class Employer extends Person implements IEmployer{
    private String company;

    public Employer(String fn, String ln, String company) {
        super(fn, ln);
        this.company = company;
    }

    //implementuje metode getCompany() z interfejsu IEmployer
    @Override
    public String getCompany(){
        return this.company;
    }

    @Override
    public String toString(){
        return "First Name: " + firstName + "\n"
                + "Last Name: " + lastName + "\n"
                + "Company: " + company;
    }
}
