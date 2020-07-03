package Optional;

public class anonymousVSlambda {
    public interface Checker<T>{
        boolean check(T object);
    }

    public static void main(String[] args) {
        Checker<Integer> isOddAnonymous = new Checker<Integer>() {
            @Override
            public boolean check(Integer object) {
                return object%2 != 0 ;
            }
        };
        Checker<Integer> isOddLambda = x -> x%2 != 0;
        System.out.println(isOddAnonymous.check(123));
        System.out.println(isOddAnonymous.check(124));
        System.out.println(isOddLambda.check(123));
        System.out.println(isOddLambda.check(124));
        System.out.println(isOddAnonymous.getClass());
    }
}
