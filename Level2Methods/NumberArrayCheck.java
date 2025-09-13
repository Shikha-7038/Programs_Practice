// 9. Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less

package Level2Methods;
import java.util.Scanner;

public class NumberArrayCheck {
    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {
            if (isPositive(n)) {
                if (isEven(n)) System.out.println(n + " is Positive and Even");
                else System.out.println(n + " is Positive and Odd");
            } else if (n < 0) {
                System.out.println(n + " is Negative");
            } else {
                System.out.println("Zero");
            }
        }

        int result = compare(arr[0], arr[arr.length - 1]);
        if (result == 0) System.out.println("First and last elements are equal.");
        else if (result > 0) System.out.println("First element is greater.");
        else System.out.println("Last element is greater.");
        sc.close();
    }
}

