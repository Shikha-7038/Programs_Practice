// 3. Write a program to find the side of the square whose parameter you read from the user 

package Level2ProgrammingElements;
import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.printf("The length of the side is %.2f whose perimeter is %.2f", side, perimeter);
        sc.close();
    }
}
