package Optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        //tworzenie nowego optionala który nie może mieć null
        Optional<String> optional = Optional.of("abc");
        //Optional<String> optional = Optional.of("");
        //Optional<String> optional = Optional.of(null);//tak nie zadziała bo wyrzuci bład
        //sprawdzenie czy w optionalu coś się znajduje
        boolean isPresent = optional.isPresent();
        System.out.println(isPresent);
//tworzenie nowego optionala który może być null
Optional<Integer> optionalInteger = Optional.ofNullable(null);
boolean isPresentInteger = optionalInteger.isPresent();
        System.out.println(isPresentInteger);
        System.out.println(optionalInteger.orElse(0));
        System.out.println(optional.orElse("cde"));
       //jeśli jest pusty to rzuć wyjatkiem
        System.out.println(optionalInteger.orElseThrow(() -> new IllegalArgumentException()));



    }
}
