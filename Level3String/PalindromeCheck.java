// 7. Write a program to check if a text is palindrome and display the result.

package Level3String;

import java.util.Scanner;
public class PalindromeCheck {

    static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    static String reverse(String text) {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Iterative check: " + isPalindromeIterative(text));
        System.out.println("Recursive check: " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Reverse compare: " + text.equals(reverse(text)));

        sc.close();
    }
}

