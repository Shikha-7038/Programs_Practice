// 2. Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text.
//    Compare the two strings and display the results.

package Level1String;
import java.util.Scanner;

public class SubstringDemo {
    // Method to create substring manually using charAt
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSub = substringUsingCharAt(str, start, end);
        String builtInSub = str.substring(start, end);

        System.out.println("Manual substring: " + manualSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Are both same? " + compareStrings(manualSub, builtInSub));
        sc.close();
    }
}
