package zaj16_02.kg.object;

public class Main {

    private static int STATIC_VAL=10;

    private int val;

    public static void main(String[] args) {

        System.out.println(Main.STATIC_VAL);

        Point point = new Point(20,20);
        point.incrementX();
        point.incrementY();
        System.out.println(point.toString());
        point.changeX(-10);
        point.changeY(-10);
        System.out.println(point.toString());
        System.out.println(point.getX());
        System.out.println(point.getY());

    }
}
