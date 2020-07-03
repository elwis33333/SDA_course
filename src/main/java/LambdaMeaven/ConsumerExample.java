package LambdaMeaven;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //1
        Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
        c.accept("Java2s.com");
        c.accept("JA NIE WIEM");
        //2
        int x = 98;

        Consumer<Integer> myConsumer = (y) ->
        {
            System.out.println("x = " + x); // Statement A
            System.out.println("y = " + y);
        };

        myConsumer.accept(x);
    }

}