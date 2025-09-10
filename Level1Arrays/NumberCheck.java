// 2. Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less

package Level1Arrays;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define array of 5 integers
        int[] numbers = new int[5];

        // Take user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check each number
        System.out.println("\nResults:");
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last element
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.println("\nComparison of first and last elements:");
        if (first == last) {
            System.out.println("First element (" + first + ") is equal to last element (" + last + ")");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ")");
        } else {
            System.out.println("First element (" + first + ") is less than last element (" + last + ")");
        }
        sc.close();
    }
}
