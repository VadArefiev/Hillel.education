package lesson10.FibonacciNumber;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println("enter a number from 0 to 30:");
        Scanner scanner = new Scanner(System.in);
        fib(scanner.nextInt());
    }

    public static void fib(int n) {

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        System.out.print("fibonacci numbers " + fib[0] + ", " + fib[1] + ", ");
        for (int i = 2; i < n; ++i) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + ", ");
        }
    }
}

