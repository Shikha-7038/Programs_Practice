package Level2Arrays;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Arrays
        int[][] marks = new int[n][3];   // Physics, Chemistry, Maths
        double[] percentage = new double[n];
        String[] grades = new String[n];
        String[] remarks = new String[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                while (true) {
                    System.out.print(subject + ": ");
                    int mark = sc.nextInt();
                    if (mark >= 0 && mark <= 100) { // valid marks
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Invalid input! Enter a positive mark between 0 and 100.");
                    }
                }
            }

            // Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Determine grade & remarks
            if (percentage[i] >= 80) {
                grades[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentage[i] >= 70) {
                grades[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentage[i] >= 60) {
                grades[i] = "C";
                remarks[i] = "Level 2, below but approaching agency-normalized standards";
            } else if (percentage[i] >= 50) {
                grades[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentage[i] >= 40) {
                grades[i] = "E";
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = "R";
                remarks[i] = "Remedial standards";
            }
        }

        // Display results
        System.out.println("\n---- Student Report ----");
        System.out.printf("%-10s %-10s %-10s %-12s %-12s %-40s\n", 
                "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Remarks");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-12s %-40s\n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grades[i], remarks[i]);
        }

        sc.close();
    }
}

