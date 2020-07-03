package Fractions;

import java.util.Objects;
import java.util.Scanner;

public class Fraction {
    private int numerator = 0;
    private int denominator = 0;

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        int ile = nwd(this.denominator, this.numerator);
        int num = numerator / ile;
        int den=denominator / ile;
        if (den<0){
            den *=  -1;
            num *= -1;
        }
        String s;
        if (den == 1 || num ==0) {s = num + "";}
        else if(Math.abs(num)>den){
            int x1 = num / den;
            int x2 = num % den;
            s = x1 + " i " + Math.abs(x2) +" / " + den;
        }
        else s = num + "/" + den;

        return s;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static Fraction load() {
        Fraction f = new Fraction();
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz licznik ułamka(liczba całkowita)");
        f.setNumerator(scan.nextInt());
        System.out.println("Wpisz mianownik ułamka (liczba całkowita)");
        do {
            f.denominator = scan.nextInt();
            if (f.denominator == 0) {
                System.out.println("Nie można dzielić przez 0 . wpisz ponownie");
            }
        }
        while (f.getDenominator() == 0);
        return f;
    }

    @Override
    public boolean equals(Object o) {
        int nwd1 = nwd(this.denominator, this.numerator);

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        int nwd2 = nwd(fraction.denominator,fraction.numerator);


        return numerator/nwd1 == fraction.numerator/nwd2 &&
                denominator/nwd1 == fraction.denominator/nwd2;
    }

    @Override
    public int hashCode() {
        int nwd1 = nwd(this.numerator,this.denominator);
        return Objects.hash(numerator/nwd1, denominator/nwd1);
    }

    public void shorten (){
        int ile = nwd(this.denominator, this.numerator);
        numerator /= ile;
        denominator /= ile;
        if (denominator<0){
            denominator *=  -1;
            numerator *= -1;
        }
    }
    private int nwd(int a, int b){ //najwiekszy wspolny dzielnik
        int r;
        while (b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static Fraction add(Fraction a, Fraction b){
        Fraction c = new Fraction();
       c.numerator=a.numerator*b.denominator+b.numerator*a.denominator;
       c.denominator=a.denominator*b.denominator;
       c.shorten();
        return c;
    }
}