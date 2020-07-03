package zaj3;

import java.util.Random;

public class debugerrr {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt();
        }
        int sum =0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

}
