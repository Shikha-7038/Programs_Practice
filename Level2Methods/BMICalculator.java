// 10. An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual

package Level2Methods;
import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for all persons and populate the array
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];      // weight in kg
            double heightCm = personData[i][1];    // height in cm
            double heightM = heightCm / 100.0;     // convert cm to meters
            double bmi = weight / (heightM * heightM);
            personData[i][2] = bmi;                // store BMI in 3rd column
        }
    }

    // Method to get BMI Status for each person
    public static String[] getBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][3]; // 10 persons, 3 values (weight, height, BMI)

        // Take input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(personData);

        // Get BMI Status
        String[] status = getBMIStatus(personData);

        // Display Results
        System.out.println("\n--- BMI Report for Team Members ---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d -> Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], status[i]);
        }

        sc.close();
    }
}

