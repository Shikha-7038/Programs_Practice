// 5. Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
// a. Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. 
// b. Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
// c. Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
// d. Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
// e. Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7

package Level3Methods;

class NumberChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int n = number;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is automorphic
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is buzz
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }
}

public class NumberChecker4 {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 9, 145,123, 1, 0, 25, 49};

        for (int number : numbers) {
            System.out.println("Number: " + number);
            System.out.println("Prime? " + NumberChecker.isPrime(number));
            System.out.println("Neon? " + NumberChecker.isNeon(number));
            System.out.println("Spy? " + NumberChecker.isSpy(number));
            System.out.println("Automorphic? " + NumberChecker.isAutomorphic(number));
            System.out.println("Buzz? " + NumberChecker.isBuzz(number));
            System.out.println("----------------------------");
        }
    }
}
