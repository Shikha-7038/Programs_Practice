// 4. Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
// a. Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
// b. Method to reverse the digits array 
// c. Method to compare two arrays and check if they are equal
// d. Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 
// e. Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it

package Level3Methods;
import java.util.Arrays;

class NumberChecker {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        if(n == 0) return 1; // Edge case for 0
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int n = number;
        int count = countDigits(n);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Method to reverse an array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
}

public class NumberChecker3 {
    public static void main(String[] args) {
        int number1 = 12321;
        int number2 = 1023;

        // Count digits
        System.out.println("Digits in " + number1 + ": " + NumberChecker.countDigits(number1));

        // Store digits
        int[] digits = NumberChecker.storeDigits(number1);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Reverse digits
        int[] reversed = NumberChecker.reverseArray(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversed));

        // Compare arrays
        System.out.println("Arrays equal? " + NumberChecker.compareArrays(digits, reversed));

        // Palindrome check
        System.out.println(number1 + " is palindrome? " + NumberChecker.isPalindrome(number1));
        System.out.println(number2 + " is palindrome? " + NumberChecker.isPalindrome(number2));

        // Duck number check
        System.out.println(number1 + " is duck number? " + NumberChecker.isDuckNumber(number1));
        System.out.println(0 + " is duck number? " + NumberChecker.isDuckNumber(0));
    }
}
