package com.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args)
    {
        System.out.print("Please enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i<number; i++){
            if (number%i == 0){
                sum += i;
            }
        }
        if (sum == number){
            System.out.println(number + " " + "is Perfect number .....");
        }else{
            System.out.println(number + " " + "is not Perfect number .....");
        }
    }
}
