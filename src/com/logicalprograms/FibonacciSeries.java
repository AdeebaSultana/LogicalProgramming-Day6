package com.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        System.out.print("Please enter a limit : ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int result = 0;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);

        for (int i=2; i<limit; i++){
            result = a+b;
            System.out.print(" " + result);
            a = b;
            b = result;
        }
    }
}
