package LambdaMeaven;

import java.util.function.Function;
public class HigherOrderFunction {
    public static void main(String[] args) {
        Function<Integer, Long> operation = getOperationFunction(1);
        Function<Integer, Long> operation2 = getOperationFunction(11);
        System.out.println(operation.apply(2));
        System.out.println(operation2.apply(2));
    }
    private static Function<Integer, Long> getOperationFunction(Integer a){
        if(a==1){
            return x -> (long) x*x;
        }
        else {
            return x -> 256L;
        }
    }
}