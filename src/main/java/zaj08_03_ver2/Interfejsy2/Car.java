package zaj08_03_ver2.Interfejsy2;

public abstract class Car {
    public static final int NUMBER_OF_WHEELS = 4; //stała
    String color;
    String name;
    Double enginePower;
    Double engineDisplacement;

    public Car(String color, String name, Double enginePower, Double engineDisplacement) {
        this.color = color;
        this.name = name;
        this.enginePower = enginePower;
        this.engineDisplacement = engineDisplacement;
    }

    public Car() {
    }
}
