package zaj08_03_ver2.Dziedziczenie.src;

public class Point2D {
    double x, y;

    public Point2D(){
        this.x=0.0;
        this.y=0.0;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point2D p){
        double dist = Math.pow(p.x-this.x, 2.0)+Math.pow(p.y-this.y, 2.0);
        return Math.sqrt(dist);
    }

    //final - ostateczna wersja metody, nie pozwala na jej nadpisywanie, przeslaanianie
    public String printPoint(){
        return this.x+"; "+this.y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
