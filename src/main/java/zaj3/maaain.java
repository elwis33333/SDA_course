package zaj3;

public class maaain {
    public static void main(String[] args) {
        Point point = new Point(20, 20);
        point.incrementx();
        System.out.println(point.toString());
        point.incrementy(100000);
        System.out.println(point.toString());

    }
}
