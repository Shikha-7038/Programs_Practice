// 7. Write a program to trim the leading and trailing spaces from a string using the charAt() method.

package Level2String;

import java.util.Scanner;

public class ManualTrim {
    static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    static String manualSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String trimmedManual = manualSubstring(input, indexes[0], indexes[1]);
        String trimmedBuiltIn = input.trim();

        System.out.println("\nManual Trim:  [" + trimmedManual + "]");
        System.out.println("Built-in Trim: [" + trimmedBuiltIn + "]");
        System.out.println("Are both same? " + compareStrings(trimmedManual, trimmedBuiltIn));

        sc.close();
    }
}
