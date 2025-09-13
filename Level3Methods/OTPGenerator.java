// 7. Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
// a. Write a method to Generate a 6- digit OTP number using Math.random().
// b. Create an array to save the OTP numbers generated 10 times.
// c. Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false.

package Level3Methods;

import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; // ensures 6 digits
    }

    // Method to check uniqueness
    public static boolean checkUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        return set.size() == arr.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("All OTPs Unique? " + checkUnique(otps));
    }
}

