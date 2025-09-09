package Level2_ControlFlow;
import java.util.Scanner;
public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number >= 1) {
            System.out.println("Factors of " + number + " are:");
            int counter = 1;
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }
        sc.close();
    }
}
