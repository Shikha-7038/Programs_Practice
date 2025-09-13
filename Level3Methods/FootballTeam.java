// 1. Create a program to find the shortest, tallest and mean height of players present in a football team.
// a. The formula to calculate the mean is: mean = sum of all elements/number of elements
// b. Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
// c. Write the method to Find the sum of all the elements present in the array.
// d. Write the method to find the mean height of the players on the football team
// e. Write the method to find the shortest height of the players on the football team 
// f. Write the method to find the tallest height of the players on the football team
// g. Finally display the results

package Level3Methods;
import java.util.*;

public class FootballTeam {

    // Method to calculate sum
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }

    // Method to calculate mean
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int val : arr) min = Math.min(min, val);
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int val : arr) max = Math.max(max, val);
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}
