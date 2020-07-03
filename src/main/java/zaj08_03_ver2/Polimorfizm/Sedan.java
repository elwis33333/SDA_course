package zaj08_03_ver2.Polimorfizm;

public class Sedan extends Car {
    String color;

    public Sedan(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public String go(){
        return "go from Sedan";
    }

    public String go2(){
        return "go2 from Sedan ofc";
    }
}
