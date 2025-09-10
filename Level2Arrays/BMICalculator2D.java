package Level2Arrays;
import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // 2D array: [person][0=Height, 1=Weight, 2=BMI]
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Take input for each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Input weight with validation
            double weight;
            while (true) {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight > 0) break;
                System.out.println("Invalid input! Weight must be positive.");
            }

            // Input height with validation
            double height;
            while (true) {
                System.out.print("Enter height (cm): ");
                height = sc.nextDouble();
                if (height > 0) break;
                System.out.println("Invalid input! Height must be positive.");
            }

            // Store weight & height
            personData[i][0] = height;
            personData[i][1] = weight;

            // Convert height to meters and calculate BMI
            double heightInMeters = height / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);

            personData[i][2] = bmi; // store BMI

            // Determine weight status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n---- BMI Report ----");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.1f %-10.1f %-10.1f %-15s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
