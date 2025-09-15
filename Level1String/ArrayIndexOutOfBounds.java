// 8. Write a program to demonstrate ArrayIndexOutOfBoundsException.

package Level1String;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    // Method to generate the Exception (no handling)
    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        // Trying to access index larger than array length
        System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
        // This line will never be executed because program stops here
        System.out.println("This line won't be executed.");
    }

    // Method to demonstrate Exception Handling
    public static void handleException(String[] names) {
        System.out.println("\nDemonstrating Exception Handling with try-catch...");
        try {
            // Again trying to access invalid index
            System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues normally after handling exception.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Defining array of names
        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // 1. Call method to generate unhandled exception
        // Uncomment this line to see abrupt termination
        // generateException(names);

        // 2. Call method to demonstrate exception handling
        handleException(names);

        sc.close();
    }
}

