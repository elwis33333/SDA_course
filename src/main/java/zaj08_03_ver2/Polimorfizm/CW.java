package zaj08_03_ver2.Polimorfizm;

import java.util.Random;

public class CW {
    public static void main(String[] args) {
        Shape shape1 = new Circle(1.0); //nowy obiekt Circle typ Shape
        Shape shape2 = new Square(1.0); //nowy obiekt Square typ Shape
        shape1.area(); //wywolanie metody area()
        shape2.area();
        System.out.println(shape1.area); //odniesienie sie do pola area;
        System.out.println(shape2.area);

        Shape[] shapes = new Shape[10]; //tworzona jest nowa tablica typu Shape
        Random rnd = new Random(); //obiekt klasy Random

        for(int i=0; i<shapes.length; i++){//petla iterujaca po tablicy
            if(rnd.nextBoolean()){ //fifty fifty - losowanie pol na pool
                shapes[i] = new Circle(rnd.nextDouble()); // tutaj towrze nowy Circle
            }
            else{
                shapes[i] = new Square(rnd.nextDouble()); //tutaj tworze nowy Square
            }

            shapes[i].area(); //uzywam metody area() nie wiedzac jaki to obiekt
        }

        for(Shape s: shapes){ //iteruje po elementach tablicy
            System.out.print(s+" "); //tutaj korzystam z metody toString z klasy Object()
            System.out.println(s.area); //wyswieltamy powierzchnie naszego ksztaltu
        }
    }
}
