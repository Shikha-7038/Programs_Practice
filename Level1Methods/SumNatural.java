// 7. Write a program to find the sum of n natural numbers using loop

package Level1Methods;

import java.util.Scanner;

public class SumNatural {
    public static int sumOfN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " natural numbers = " + sumOfN(n));
        sc.close();
    }
}

