// 10. Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade.

package Level2String;

import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, Math
    static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // PCM for each student
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + rand.nextInt(90); // range: 10–99
            }
        }
        return scores;
    }

    // Method to calculate total, average, percentage
    static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; 
        // [][0]=Total, [][1]=Average, [][2]=Percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;   // round 2 digits
            results[i][2] = Math.round(perc * 100.0) / 100.0;  // round 2 digits
        }
        return results;
    }

    // Method to calculate grade
    static String[] calculateGrade(double[][] results) {
        String[] grade = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double perc = results[i][2];
            if (perc >= 80) grade[i] = "A";
            else if (perc >= 70) grade[i] = "B";
            else if (perc >= 60) grade[i] = "C";
            else if (perc >= 50) grade[i] = "D";
            else if (perc >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        return grade;
    }

    // Method to display scorecard
    static void displayScoreCard(int[][] scores, double[][] results, String[] grade) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-8s %-10s %-10s %-10s %-8s %-8s %-12s %-6s\n",
                "Stu_ID", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d %-10d %-10d %-10d %-8.0f %-8.2f %-12.2f %-6s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grade[i]);
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grade = calculateGrade(results);

        displayScoreCard(scores, results, grade);

        sc.close();
    }
}

