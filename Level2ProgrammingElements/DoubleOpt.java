// 8. Similarly, write the DoubleOpt program by taking double values and doing the same operations.

package Level2ProgrammingElements;
import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter double a: ");
        double a = sc.nextDouble();

        System.out.print("Enter double b: ");
        double b = sc.nextDouble();

        System.out.print("Enter double c: ");
        double c = sc.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f", result1, result2, result3, result4);
        sc.close();
    }
}
