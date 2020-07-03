package zaj5.shape;

/**
 * Created by pwykowski
 */
public class Circle {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calcArea() {
        return (this.r * this.r * Math.PI); // Pi r kwadrat :)
    }

    public double calcPerimeter() {
        return 2 * this.r * Math.PI; // 2 Pi r
    }

}
