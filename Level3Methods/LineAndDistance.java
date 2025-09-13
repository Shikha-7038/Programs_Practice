/*9. Write a program Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()
a. Take inputs for 2 points x1, y1, and x2, y2 
b. Method to find the Euclidean distance between two points and return the distance
distance = (x2-x1)2 +(y2-y1)2 
c. Write a Method to find the equation of a line given two points and return the equation which includes the slope and the y-intercept
The equation of a line is given by the equation y = m*x + b Where m is the slope and b is the y-intercept. So firstly compute the slope using the formulae 
m = (y2 - y1)/(x2 - x1)
Post that compute the y-intercept b using the formulae 
b = y1 - m*x1  
Finally, return an array having slope m and y-intercept b 
 */

package Level3Methods;
import java.util.Scanner;

public class LineAndDistance {

    // Method to calculate Euclidean distance
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    // Method to find slope (m) and y-intercept (b) of the line
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; // [m, b]
        
        if (x1 == x2) {
            System.out.println("The line is vertical. Slope is undefined.");
            result[0] = Double.POSITIVE_INFINITY; // slope = infinity
            result[1] = Double.NaN; // no y-intercept
            return result;
        }

        double m = (y2 - y1) / (x2 - x1);   // slope
        double b = y1 - m * x1;             // intercept
        result[0] = m;
        result[1] = b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Compute distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between points: %.2f%n", distance);

        // Compute line equation
        double[] line = lineEquation(x1, y1, x2, y2);
        if (line[0] != Double.POSITIVE_INFINITY) {
            System.out.printf("Equation of line: y = %.2fx + %.2f%n", line[0], line[1]);
        }

        sc.close();
    }
}
