package lesson10.FibonacciNumber;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {

        System.out.println(new FibonacciNumber().fib(5));
    }

    int fib(int n) {

        int first = 0;
        int second = 1;
        int third;
        System.out.println("fibonacci number " + n + ":");
        System.out.print(first + " " + second);
        if (n >= 2 && n <= 30) {
            for (int i = 2; i <= n; i++) {
                third = first + second;
                first = second;
                second = third;
            }
            return second;
        }
        return n;
    }
}


//
//
//    public static void main(String[] args) {
//
//        Scanner sn = new Scanner(System.in);
//        System.out.print("enter any number: ");
//
//    int n = sn.nextInt();
//    int a = 0;
//    int b = 1;
//    int fib = 2;
//    int i = 2;
//
//        System.out.println("fibonacci number " + n + ":" );
//        System.out.print(a + " " + b);
//        while (i < n) {
//        fib = a + b;
//        a = b;
//        b = fib;
//        i++;
//        System.out.print(" " + fib);
//        }
//    }
//}