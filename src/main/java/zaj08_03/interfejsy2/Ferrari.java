package zaj08_03.interfejsy2;

public class Ferrari extends SportCar {
    public Ferrari() {
        this.color="Ferrari";
        this.name="Srari";
        this.enginePower=200;
        this.engineDisplacement=14880;
    }

    public void whoAreYou(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Ferrari{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", enginePower=" + enginePower +
                ", engineDisplacement=" + engineDisplacement +
                '}';
    }
}
