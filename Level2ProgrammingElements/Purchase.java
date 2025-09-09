// 5. Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.

package Level2ProgrammingElements;
import java.util.Scanner;

public class Purchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double total = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f", total, quantity, unitPrice);
        sc.close();
    }
}
