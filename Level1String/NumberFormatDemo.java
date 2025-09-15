// 7. Write a program to demonstrate NumberFormatException.

package Level1String;

import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException (without handling)
    static void generateException(String text) {
        // If text is not a valid integer, this will throw NumberFormatException
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException with try-catch
    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input as String
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Case 1: Generate exception (unhandled - program will crash if uncommented)
        // generateException(input);

        // Case 2: Handle exception properly
        handleException(input);

        sc.close();
    }
}

