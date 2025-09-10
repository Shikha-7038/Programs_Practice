package Level1Arrays;

import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (0 or negative to stop):");

        while (true) {
            double num = sc.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        // Calculate total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Print numbers
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of numbers: " + total);
        sc.close();
    }
}
