package zaj3;

public class Point {

    public int getX() { return x; }
    public int getY() { return y; }
    private int x;
    private int y;
    public void setX(int x) { this.x = x;}
    public void setY(int y) { this.y = y;}
    public  Point(int x, int y) { this.x = x;this.y = y;}
    public  Point() { this.x = 100;this.y = 100;}
    public void incrementx() { this.x++; }
    public void incrementy() { this.y++; }
    public void incrementx(int a) { this.x += a;}
    public void incrementy(int a) { this.y += a; }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
