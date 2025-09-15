// 8. Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.


package Level2String;

import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rand.nextInt(50); // random age between 10–59
        }
        return ages;
    }

    static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "Cannot Vote";
            else if (ages[i] >= 18) result[i][1] = "Can Vote";
            else result[i][1] = "Cannot Vote";
        }
        return result;
    }

    static void displayTable(String[][] arr) {
        System.out.println("\nAge\tEligibility");
        System.out.println("------------------");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = generateAges(10);
        String[][] eligibility = checkVoting(ages);
        displayTable(eligibility);

        sc.close();
    }
}

