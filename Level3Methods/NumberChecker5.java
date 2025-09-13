// 6. Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
// a. Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
// b. Method to find the greates factor of a Number using the factors array
// c. Method to find the sum of the factors using factors array and return the sum
// d. Method to find the product of the factors using factors array and return the product
// e. Method to find product of cube of the factors using the factors array. Use Math.pow() 
// f. Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
// g. Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
// h. Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
// i. Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself

package Level3Methods;

import java.util.Arrays;

class NumberChecker {

    // Method to find factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    // Method to find greatest factor using factors array
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1]; // last element is greatest
    }

    // Method to find sum of factors
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Method to find product of cube of factors
    public static long productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    // Method to check perfect number
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    // Method to check abundant number
    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum > number;
    }

    // Method to check deficient number
    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum < number;
    }

    // Method to check strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int n = number;
        while (n != 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return sum == number;
    }

    // Helper method to compute factorial
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }
}

public class NumberChecker5 {
    public static void main(String[] args) {
        int number = 28; // You can test with any number

        // Factors
        int[] factors = NumberChecker.findFactors(number);
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));

        // Greatest factor
        System.out.println("Greatest factor: " + NumberChecker.greatestFactor(number));

        // Sum of factors
        System.out.println("Sum of factors: " + NumberChecker.sumOfFactors(number));

        // Product of factors
        System.out.println("Product of factors: " + NumberChecker.productOfFactors(number));

        // Product of cube of factors
        System.out.println("Product of cube of factors: " + NumberChecker.productOfCubeOfFactors(number));

        // Perfect, abundant, deficient checks
        System.out.println("Is perfect? " + NumberChecker.isPerfect(number));
        System.out.println("Is abundant? " + NumberChecker.isAbundant(number));
        System.out.println("Is deficient? " + NumberChecker.isDeficient(number));

        // Strong number check
        int strongNumber = 145;
        System.out.println(strongNumber + " is strong number? " + NumberChecker.isStrongNumber(strongNumber));
    }
}

