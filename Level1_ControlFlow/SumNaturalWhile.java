import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            // Formula
            int formulaSum = n * (n + 1) / 2;

            // Using while loop
            int i = 1, sum = 0;
            while (i <= n) {
                sum += i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Both results are equal? " + (sum == formulaSum));
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
        sc.close();
    }
}
