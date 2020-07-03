package zaj08_03_ver2.Dziedziczenie.src;

public class Vehicle {
    protected int speed;
    protected int maxSpeed;

    public Vehicle(){
        this.speed=0;
        this.maxSpeed=0;
    }

    public Vehicle(int speed, int maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
