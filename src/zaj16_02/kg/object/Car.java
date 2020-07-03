package zaj16_02.kg.object;

public class Car {

    private int numOfWheels;
    private String color;
    private int velocity=100;

    public Car(int numOfWheels, String color, int velocity) {
        this.numOfWheels = numOfWheels;
        this.color = color;
        this.velocity = velocity;
    }

    public Car() {
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        if(numOfWheels>0) {
            this.numOfWheels = numOfWheels;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numOfWheels=" + numOfWheels +
                ", color='" + color + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
