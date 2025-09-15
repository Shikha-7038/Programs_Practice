// 1. An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. 
//    For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
/*  a. Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. 
       The First Column stores the weight and the second column stores the height in cm
    b. Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. 
       Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
    c. Create a Method that takes the 2D array of height and weight as parameters. 
       Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
    d. Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
    e. Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

package Level3String;

import java.util.Scanner;
public class BMICalculator {

    static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimal places

        String status;
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";

        return new String[]{String.valueOf(weight), String.valueOf(heightCm),
                            String.valueOf(bmi), status};
    }

    static String[][] processBMI(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            results[i] = calculateBMI(data[i][0], data[i][1]);
        }
        return results;
    }

    static void displayResults(String[][] results) {
        System.out.println("--------------------------------------------");
        System.out.printf("%-8s %-10s %-10s %-10s %-12s\n",
                "ID", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-8d %-10s %-10s %-10s %-12s\n",
                    (i + 1), results[i][0], results[i][1],
                    results[i][2], results[i][3]);
        }
        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = 10;
        double[][] data = new double[persons][2]; 

        System.out.println("Enter weight (kg) and height (cm) for " + persons + " persons:");

        for (int i = 0; i < persons; i++) {
            System.out.print("Person " + (i + 1) + " Weight(kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " Height(cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] results = processBMI(data);
        displayResults(results);

        sc.close();
    }
}

