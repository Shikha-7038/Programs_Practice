// 14. Write a program the find the distance in yards and miles for the distance provided by user in feets

import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("The distance " + feet + " feet is " + yards + " yards and " + miles + " miles.");
        sc.close();
    }
}
