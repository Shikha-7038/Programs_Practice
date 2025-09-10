// 10. Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit

package Level2Arrays;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Frequency array for digits 0-9
        int[] freq = new int[10];

        // Process digits
        long temp = Math.abs(number);  // handle negative numbers
        while (temp > 0) {
            int digit = (int)(temp % 10);
            freq[digit]++;
            temp /= 10;
        }

        // Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
