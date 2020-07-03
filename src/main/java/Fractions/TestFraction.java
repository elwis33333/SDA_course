package Fractions;

public class TestFraction {
    public static void main(String[] args) {

        //Fraction f = new Fraction(); //niepoprawne wywołanie
        Fraction f1 = Fraction.load();
        System.out.println("Podany ułamek f1 = " + f1);

        //Należy podać ułamek do skrócenia, np. 4/6

         Fraction f2 = Fraction.load();
        System.out.println("Podany ułamek f2 = " + f2);
        f2.shorten();
        System.out.println("Ułamek po skróceniu f2 = " + f2);

//        //Porównanie ułamków, np 3/-9 i -2/6

          Fraction f3 = Fraction.load();
          System.out.println("Podany ułamek f3 = " + f3);
          Fraction f4 = Fraction.load();
          System.out.println("Podany ułamek f4 = " + f4);
          f3.shorten();
          f4.shorten();
          if (f3.equals(f4)) System.out.println("f3 = f4 = " + f4);
          else System.out.println("f3 = " + f3 + " != f4 = " + f4);

        //Dodawanie ułamków, np. 7/5 i 1/3
        Fraction f5 = Fraction.load();
        System.out.println("Podany ułamek f5 = " + f5);
        Fraction f6 = Fraction.load();
        System.out.println("Podany ułamek f6 = " + f6);
        System.out.println("f5 + f6 = " + Fraction.add(f5, f6));
    }
}
