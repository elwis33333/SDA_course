package zaj08_03_ver2.Dziedziczenie.src;

public class Point3D extends Point2D {
    double z;

    public Point3D(){
        super();
        this.z=0.0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    //przeciazenie metody w klasie dziedziczacej (ta sama nazwa, inna sygnatura metody)
    public double calculateDistance(Point3D p){
        double dist = Math.pow(p.x-this.x, 2.0)+Math.pow(p.y-this.y, 2.0)
                +Math.pow(p.z-this.z, 2.0);
        return Math.sqrt(dist);
    }

    //przesloniecie/nadpisanie metody w klasie dziedziczacej
    //ta sama nazwa, ta sama sygnatura metody
    @Override
    public String printPoint(){
        return this.x+"; "+this.y+"; "+this.z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
