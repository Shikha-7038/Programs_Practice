package Level1_ControlFlow;

import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = sc.nextDouble();

            if (value <= 0) {
                break;  // exit loop if 0 or negative
            }

            total += value;
        }

        System.out.println("The total sum is: " + total);
        sc.close();
    }
}

