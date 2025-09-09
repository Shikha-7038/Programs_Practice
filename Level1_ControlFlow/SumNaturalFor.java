package Level1_ControlFlow;

import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            // Formula
            int formulaSum = n * (n + 1) / 2;

            // Using for loop
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Both results are equal? " + (sum == formulaSum));
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
        sc.close();
    }
}

