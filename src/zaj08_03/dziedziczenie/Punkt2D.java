package zaj08_03.dziedziczenie;

public class Punkt2D {

    double x;
    double y;

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public double calculateDistance(Punkt2D p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
    }

    public String printPoint(){
        return this.x + "; "+this.y;
    }

    @Override
    public String toString() {
        return "Punkt2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
