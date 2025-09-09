// 6. Write a program to take 2 numbers and print their quotient and reminder

package Level2ProgrammingElements;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d", quotient, remainder, number1, number2);
        sc.close();
    }
}

