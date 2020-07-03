package zaj08_03_ver2.Polimorfizm;

public class MainTest {
    public static void main(String[] args) {
        Car carCar = new Car("Honda");//ref: Car; typ obiektu: Car
        Car car = new Sedan("Mazda", "Red");//ref: Car; typ obiektu: Sedan
        Sedan sedan = new Sedan("Mazda", "Red");//ref: Sedna; typ obiektu: Sedan

        //typ referencji okresla zakres dostepnych metod
        //typ obiektu okresla z ktorej klasy metody zostana wywolane
        System.out.println(carCar.go()); //wywyolanie metody go() z klasy Car
        System.out.println(car.go()); //wywolanie metody go() z klasy Sedan
//        System.out.println(car.go2()); //nie zadziala bo nie widzi go2();
        System.out.println(((Sedan)car).go2());//rzutuje obiekt car na typ referencji Sedan
        System.out.println(sedan.go2()); //widze metode go2() bo typ referencji to Sedan
    }
}
