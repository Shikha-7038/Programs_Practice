package Level3_ControlFlow;
import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number); // handle negative numbers too

        if (temp == 0) {
            count = 1; // special case: 0 has 1 digit
        } else {
            while (temp != 0) {
                temp /= 10;  // remove last digit
                count++;     // increase count
            }
        }

        System.out.println("Number of digits in " + number + " is: " + count);
        sc.close();
    }
}
