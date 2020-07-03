package Optional;

import java.util.function.Function;
import java.util.function.Supplier;

public class WyrazeniaLambda {
    @FunctionalInterface
    interface IDoubleIn{
        void operation(Integer a, Long b);
    }
    public static void main(String[] args) {
        //1
        Function<Integer,Integer> squareLambda = x -> x*x;
        System.out.println(squareLambda.apply(3));
        //2
        Supplier<String> getString =() -> "some string123";
        System.out.println(getString.get());
        //3
        IDoubleIn multiplicationShow = (Integer x, Long y) -> System.out.println(x * y);
        multiplicationShow.operation(2,7L);
        //4
        Function<Integer,Long> checkAndReturn = x -> {
            if (x != null && x % 2 == 0){
                return (long) x * x;
            }
            else {
                return 123L;
            }
        };
        System.out.println(checkAndReturn.apply(2));
        System.out.println(checkAndReturn.apply(3));
        System.out.println(checkAndReturn.apply(null));
    }
}
