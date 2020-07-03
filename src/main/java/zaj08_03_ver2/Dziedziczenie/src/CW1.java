package zaj08_03_ver2.Dziedziczenie.src;

public class CW1 {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();

        System.out.println(point2D);
        System.out.println(point3D);

        Point2D nextPoint2D = new Point2D(5.0, 5.0);
        Point3D nextPoint3D = new Point3D(3.0, 3.0, 3.0);

        System.out.println(nextPoint2D);
        System.out.println(nextPoint3D);

        //w tym miejscu uzywana jest metoda z klasy Point2D
        System.out.println(nextPoint2D.calculateDistance(point2D));
        //w tym miejscu uzywana jest metoda z klasy potomnej Point3D
        System.out.println(nextPoint3D.calculateDistance(point3D));
        //w tym miejscu uzywana jest metoda z klasy Point2D,
        // //ale wykorzystywane sa tylko pola x, y z klasy Point3D
        System.out.println(nextPoint3D.calculateDistance(point2D));

        System.out.println(nextPoint2D.printPoint());
        System.out.println(nextPoint3D.printPoint());
    }
}
