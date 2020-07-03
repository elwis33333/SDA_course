package LambdaMeaven;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.SortedSet;
import java.util.function.*;

import static java.lang.Math.pow;

public class Zad1Lambda {
    @FunctionalInterface
    public interface MathOperation {
        public Double calculate(Double a, Double b);
    }

    @FunctionalInterface
    public interface MathOperationGeneric<T> {
        public T operation(T a, T b);
    }

    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;
        System.out.println(add.calculate(3.0, 4.0));
        System.out.println(sub.calculate(3.0, 4.0));
        System.out.println(mul.calculate(3.0, 4.0));
        System.out.println(div.calculate(3.0, 4.0));
        //rozwiazanie generyczne
        MathOperationGeneric<Long> add2 = (a, b) -> a + b;
        System.out.println(add2.operation(1L, 2L));
        //zad2
        //wyrażenie lambda zamieniajace tekst na wielkie litery
        UnaryOperator<String> operator = x -> x.toUpperCase();
        System.out.println(operator.apply(("karol")));
        UnaryOperator<String> toUpperCase = String::toUpperCase; //inna metoda
        System.out.println(toUpperCase.apply("abc"));
        //zad3
        String[] cos = new String[10];
        Function<String[], Integer> f = (x) -> x.length;
        System.out.println(f.apply(cos));
        //zad4
        Integer[] tabInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Function<Integer[], Integer> f1 = (x) -> {
            int sum = 0;
            for (int i = 0; i < x.length; i++) {
                sum = sum + x[i];
            }
            return sum / x.length;

        };
        System.out.println(f1.apply(tabInt));
        //5
        UnaryOperator<String> operator3 = x -> x.toUpperCase();
        Consumer<String> consumer = x -> System.out.println(operator3.apply(x));
        consumer.accept("karol");
        //6
        /*
        Random random = new Random();
        Supplier<ArrayList<Double>> supplier = () -> {
            ArrayList<Double> listaa = new ArrayList(10);
            for (int i = 0; i < listaa.size(); i++) {
                listaa.set(i, random.nextDouble());
            }
            return listaa;
        };
        List<Double> xxx = supplier.get();
        System.out.println(xxx);
        System.out.println(supplier.get());
*/
        //7
        Function<Double, Double> f5 = (r) -> Math.PI*pow(r,2);
        System.out.println(f5.apply(2.0));
        //8
        Predicate<Integer> sprawdzCzyLiczbaJestParzysta = (a) -> {
            if ( a%2 == 0) return true;
            else return false;
        };
        int aa = 10;
        System.out.println("Czy liczba "+aa+" jest parzysta?? -> "+sprawdzCzyLiczbaJestParzysta.test(aa));
        //9
        Consumer<Integer> sprawdzCzyLiczbaJestLiczbaPierwsza = (n) -> {
            if(n<2) System.out.println("gdy liczba jest mniejsza niż 2 to nie jest pierwszą");
             else {
                for (int i = 2; i * i <= n; i++)
                    if (n % i == 0){
                        System.out.println("Liczba " + n + " nie jest liczbą pierwszą");return;}
                System.out.println("Liczba " + n + " jest liczbą pierwszą");
            }
        };
        sprawdzCzyLiczbaJestLiczbaPierwsza.accept(1);
        //10
        //silnia rekurencyjna w oparciu o interfejs UnaryOperator z użyciem klasy anonimowej
        UnaryOperator<Integer> factorial  = new UnaryOperator<Integer>(){
            @Override
            public Integer apply(Integer n){
                if(n<=2){
                    return n; //wiemy że silnia z 1 to 1 a z 2 to 2
                }
                else{
                    return n*apply(n-1); // w pozostałych przypadkach dokonujemy obliczeń
                }
            }
        };
        System.out.println(factorial.apply(10));
        //11
        /*
Function<T,U> ZmienIntNaCharINaOdwrot = (a) -> {
    if (T instanceof Integer) {Character b = (Character) a; return b;}//return (char)a;
    else if(T instanceof Character) {System.out.println("Działa"); return -5;}//return Integer.parseInt(String.valueOf(a));
    else return -1;
};
        System.out.println(ZmienIntNaCharINaOdwrot.apply(50));*/
        //12
        BiConsumer<Integer,Integer> rysojProstokat = (a,b) ->{
            for (Integer i = 0; i < a; i++) {
                System.out.print("*");
            }
            System.out.println("");
            for (int i = 0; i < (b - 2); i++) {
                System.out.print("*");
                for (int i1 = 0; i1 < (a - 2); i1++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (Integer i = 0; i < a; i++) {
                System.out.print("*");
            }
        };
        rysojProstokat.accept(10,4);


    }

}
