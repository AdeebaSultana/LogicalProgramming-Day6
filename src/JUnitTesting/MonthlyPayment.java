package JUnitTesting;

// import Utilitymethod.java.util;


import java.util.Scanner;
public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Principle amount");
        double p=sc.nextDouble();
        System.out.println("Enter no of  years");
        double y=sc.nextDouble();
        System.out.println("Enter Rate of Interest :");

        double r=sc.nextDouble();

        Object Utilitymethod = new Object();
    }
    public static void Sqrt(int c) {
        double epsilon = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
    }
}
