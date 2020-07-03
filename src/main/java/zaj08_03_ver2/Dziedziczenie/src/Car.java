package zaj08_03_ver2.Dziedziczenie.src;

public class Car extends Vehicle {
    private int engineDisplacement;

    public Car() {
        super();
        this.engineDisplacement=500;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineDisplacement=" + engineDisplacement +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public Car(int speed, int maxSpeed, int engineDisplacement) {
        super(speed, maxSpeed);
        this.engineDisplacement = engineDisplacement;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }
}
