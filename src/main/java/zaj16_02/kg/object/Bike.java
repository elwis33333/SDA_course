package zaj16_02.kg.object;

public class Bike {
    private int numOfWheels;

    public Bike(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Bike() {
        this.numOfWheels = 2;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }
}
