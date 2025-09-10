package Level2Arrays;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Arrays to store values
        double[] weight = new double[n];
        double[] height = new double[n];  // in cm
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            height[i] = sc.nextDouble();

            // Convert cm to meters
            double heightInMeters = height[i] / 100.0;

            // Calculate BMI
            bmi[i] = weight[i] / (heightInMeters * heightInMeters);

            // Determine status based on BMI table
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n---- BMI Report ----");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.1f %-10.1f %-10.1f %-15s\n", height[i], weight[i], bmi[i], status[i]);
        }

        sc.close();
    }
}
