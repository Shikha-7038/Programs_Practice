package Level1Arrays;
import java.util.Scanner;

public class Multiplication6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] table = new int[4]; // store results from 6–9

        for (int i = 6; i <= 9; i++) {
            table[i - 6] = number * i;
        }

        // Display results
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 6]);
        }
        sc.close();
    }
}
