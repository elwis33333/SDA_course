package zaj08_03.dziedziczenie;

public class Punkt3D extends Punkt2D{

    double z;

    public Punkt3D(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    public Punkt3D(){
        super();
        this.z=0;
    }

    public double calculateDistance(Punkt3D p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2)+Math.pow(this.z-p.z,2));
    }

    @Override
    public String printPoint(){
        return this.x + "; "+this.y+"; "+this.z;
    }

    @Override
    public String toString() {
        return "Punkt3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
