// 4. An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete

package Level1Methods;

import java.util.Scanner;

public class AthleteRounds {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side3: ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.println("Athlete needs to complete " + Math.ceil(rounds) + " rounds.");
        sc.close();
    }
}
