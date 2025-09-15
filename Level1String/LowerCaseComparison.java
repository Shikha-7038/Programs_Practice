// 10. Write a program to convert the complete text to lowercase and compare the results.

package Level1String;

import java.util.Scanner;
public class LowerCaseComparison {

    static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // User-defined lowercase conversion
        String manualLower = convertToLowerCase(input);

        // Built-in lowercase conversion
        String builtInLower = input.toLowerCase();

        boolean isSame = compareStrings(manualLower, builtInLower);

        System.out.println("\nManual LowerCase:   " + manualLower);
        System.out.println("Built-in LowerCase: " + builtInLower);
        System.out.println("Are both same? " + isSame);

        sc.close();
    }
}

