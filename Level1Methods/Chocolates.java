// 10. Create a program to divide N number of chocolates among M children.
//Print the number of chocolates each child will get and also the remaining chocolates.

package Level1Methods;

import java.util.Scanner;

public class Chocolates {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int eachGets = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{eachGets, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + result[0] + " chocolates, Remaining = " + result[1]);
        sc.close();
    }
}
