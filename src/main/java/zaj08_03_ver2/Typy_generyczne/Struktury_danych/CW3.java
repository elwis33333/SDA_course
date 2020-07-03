package zaj08_03_ver2.Typy_generyczne.Struktury_danych;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CW3 {
    public static void main(String[] args) {

        List<Long> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number of Fibonnaci Numbers:");

        int n = scanner.nextInt();

        for (int i=0; i<n; i++){
            list.add(calculateFibonacciNumber(i));
        }

        System.out.println(list);
    }

    private static long calculateFibonacciNumber(long n){
        if(n<2){
            return n;
        }
        else{
            return calculateFibonacciNumber(n-1)+calculateFibonacciNumber(n-2);
        }
    }
}

