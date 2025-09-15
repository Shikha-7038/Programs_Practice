// 1. Write a program to find and return the length of a string without using the length() method.

package Level2String;

import java.util.Scanner;

public class StringLengthFinder {

    // Method to find string length without using length()
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Will throw exception when index out of bounds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        int manualLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("Manual Length:   " + manualLength);
        System.out.println("Built-in Length: " + builtInLength);

        sc.close();
    }
}

