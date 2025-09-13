/* 10. Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 
a. Take inputs for 3 points x1, y1, x2, y2, and x3, y3
b. Write a Method to find the 3 points that are collinear using the slope formula. The 3 points A(x1,y1), b(x2,y2), and c(x3,y3) are collinear if the slopes formed by 3 points ab, bc, and cd are equal. 
slope AB = (y2 - y1)/(x2 - x1), slope BC = (y3 - y2)/(x3 - x3)
slope AC = (y3 - y1)/(x3 - x1) Points are collinear if
slope AB = slope BC = slope Ac
c. The method to find the three points is collinear using the area of the triangle formula. The Three points are collinear if the area of the triangle formed by three points is 0. The area of a triangle is 
 */

package Level3Methods;
import java.util.Scanner;

public class CollinearPoints {

    // Method 1: Check collinearity using slope formula
    public static boolean areCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Avoid division by zero → use cross multiplication instead of slope equality
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method 2: Check collinearity using area of triangle formula
    public static boolean areCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 points
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();

        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();

        // Check collinearity using slope method
        boolean collinearSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        
        // Check collinearity using area method
        boolean collinearArea = areCollinearArea(x1, y1, x2, y2, x3, y3);

        // Results
        if (collinearSlope && collinearArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }

        sc.close();
    }
}

