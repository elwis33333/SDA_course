package zaj08_03_ver2.Polimorfizm;

public class Circle extends Shape{
    double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void area(){
        this.area=Math.PI*Math.pow(diameter, 2.0)/4.0;
    }
}
