package HelloWorld.calculations;

import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    /*
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println(n + "-ty wyraz ciagu Fibonacciego: " + fib(n));
        }
    }


    public static int fib(int n) {
        if ((n == 1) || (n == 2))
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }*/
/*
    public static void printTriagle(int n){
      for (int i=0; i<n; i++)
            {
                for (int j=n-i; j>1; j--)
                {
                    System.out.print(" ");
                }
                for (int j=0; j<=i; j++ )
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void main(String args[])
        {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                printTriagle(n);
            }
        }
*/

/*
    public static void main(String[] args) {
        int n, first = 0, next = 1;
        System.out.println("Enter how may fibonnaci numbers to print");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("The first " + n + " Fibonacci numbers are: 0");
        for (int i = 0; i <= n - 2; i++) {
            next = first + next;
            first = next - first;
            System.out.println(next);
        }

    }*/



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random generator = new Random();
            int proba = 0;
            long strzal = 0;
            long wylosowanaLiczba = generator.nextLong();
            System.out.println("Losuje liczbe z zakresu od 0 do 100 ");
            System.out.println(wylosowanaLiczba);
            while (strzal != wylosowanaLiczba) {
                System.out.println("Zgadnij jaka to liczba: ");
                strzal = input.nextLong();
                proba++;
                if (strzal < wylosowanaLiczba) {
                    System.out
                            .println("Niestety, to za malo. Podaj wieksza liczbe");
                } else if (strzal > wylosowanaLiczba) {
                    System.out.println(
                            "Podana liczba to za duzo. Podaj mniejsza liczbe");
                } else if (strzal == wylosowanaLiczba) {
                    System.out.println("Bravo!Zgadles w probie: " + proba);
                }
                if (proba == 6){
                    System.out.println("Liczba to: " + wylosowanaLiczba);
                    return;
                }
            }
        }
    }
