package zaj08_03.interfejsy;

public class Employer extends Person implements IEmployer {

    private String company;

    public Employer(String fn, String sn, String company) {
        super(fn, sn);
        this.company = company;
    }

    @Override
    public String getCompany() {
        return this.company;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
