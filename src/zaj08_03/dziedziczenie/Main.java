package zaj08_03.dziedziczenie;

public class Main {
    public static void main(String[] args) {
        Punkt2D point2D1 = new Punkt2D(2, 2);
        Punkt2D point2D2 = new Punkt2D(3, 3);
        Punkt3D point3D1 = new Punkt3D();
        Punkt3D point3D2 = new Punkt3D(2, 2, 1);
        System.out.println(point2D1);
        System.out.println(point3D2);
        System.out.println(point3D1);

        System.out.println(point2D1.calculateDistance(point2D2));
        System.out.println(point3D2.calculateDistance(point2D2));

        System.out.println(point3D1.printPoint());
        System.out.println(point2D1.printPoint());
    }
}
