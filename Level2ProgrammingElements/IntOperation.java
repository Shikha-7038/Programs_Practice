// 7. Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 

package Level2ProgrammingElements;
import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = sc.nextInt();

        System.out.print("Enter integer b: ");
        int b = sc.nextInt();

        System.out.print("Enter integer c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.printf("The results of Int Operations are %d, %d, %d, and %d", result1, result2, result3, result4);
        sc.close();
    }
}

