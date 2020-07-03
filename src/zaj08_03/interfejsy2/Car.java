package zaj08_03.interfejsy2;

public abstract class Car {
    public static final int NUMBER_OF_WHEELS=4; //stała
    String color;
    String name;
    double enginePower;
    double engineDisplacement;

    public Car(String color, String name, double enginePower, double engineDisplacement) {
        this.color = color;
        this.name = name;
        this.enginePower = enginePower;
        this.engineDisplacement = engineDisplacement;
    }

    public Car() {
    }
}
