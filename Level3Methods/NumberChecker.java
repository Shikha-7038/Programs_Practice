// 2. Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
// a. Method to Find the count of digits in the number
// b. Method to Store the digits of the number in a digits array
// c. Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
// d. Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
// e. Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
// f. Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.

package Level3Methods;

import java.util.Arrays;

public class NumberChecker {

    // Method to find count of digits in the number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits of the number in an array
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Method to check if number is a Duck number
    // (Duck number has at least one '0' but does not start with 0)
    public static boolean isDuck(int num) {
        String s = String.valueOf(num);
        return s.contains("0") && s.charAt(0) != '0';
    }

    // Method to check if number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == num;
    }

    // Method to find largest and second largest element in digits array
    public static int[] findTwoLargest(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    // Method to find smallest and second smallest element in digits array
    public static int[] findTwoSmallest(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    // Main method to test
    public static void main(String[] args) {
        int num = 153;  // Example number
        int[] digits = getDigits(num);

        System.out.println("Number: " + num);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of Digits: " + countDigits(num));
        System.out.println("Duck Number? " + isDuck(num));
        System.out.println("Armstrong Number? " + isArmstrong(num));

        int[] largest = findTwoLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findTwoSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}

