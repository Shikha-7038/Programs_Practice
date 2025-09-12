// 1. Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

package Level1Methods;
import java.util.Scanner;

public class SimpleInterest {
    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double si = calculateSI(principal, rate, time);
        System.out.println("The Simple Interest is " + si + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time);
        sc.close();
    }
}

