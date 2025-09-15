// 6. Write a program to demonstrate IllegalArgumentException.

package Level1String;

import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException (without handling)
    static void generateException(String text) {
        // Start index is greater than end index → causes IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException with try-catch
    static void handleException(String text) {
        try {
            // Start index > end index → will throw exception
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Case 1: Generate exception (unhandled - crashes if uncommented)
        // generateException(input);

        // Case 2: Handle exception properly
        handleException(input);

        sc.close();
    }
}
