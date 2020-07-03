package zaj08_03_ver2.Dziedziczenie.src;

public class Bicycle extends Vehicle {
    private int numOfShifts;

    public Bicycle() {
        super();
        this.numOfShifts = 3;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "numOfShifts=" + numOfShifts +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public Bicycle(int speed, int maxSpeed, int numOfShifts) {
        super(speed, maxSpeed);
        this.numOfShifts = numOfShifts;
    }

    public int getNumOfShifts() {
        return numOfShifts;
    }

    public void setNumOfShifts(int numOfShifts) {
        this.numOfShifts = numOfShifts;
    }
}
