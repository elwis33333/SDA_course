package LambdaMeaven;

import java.util.function.Function;

public class FunctionInterfaceExample {
    public static void main(String[] args) {
        String string = operation(a -> "Result is: " + a.toString(),12);
        System.out.println(string);
    }
    //metodda ktora przyjmuje wyrażenie lambda interfejsu funkcyjnego Function
    //metoda wykonuje operacje zapisane w danym wyrażeniu lambda na podanym argumencie a
    private static String operation(Function<Integer,String> f, Integer a){
    return  f.apply(a);
    }
}
