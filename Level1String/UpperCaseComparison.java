// 9. Write a program to convert the complete text to uppercase and compare the results.

package Level1String;

import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert lowercase letters to uppercase manually using charAt()
    static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32
                ch = (char) (ch - 32);
            }

            result.append(ch);
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // User-defined uppercase conversion
        String manualUpper = convertToUpperCase(input);

        // Built-in uppercase conversion
        String builtInUpper = input.toUpperCase();

        // Compare results
        boolean isSame = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nManual UpperCase:   " + manualUpper);
        System.out.println("Built-in UpperCase: " + builtInUpper);
        System.out.println("Are both same? " + isSame);

        sc.close();
    }
}
