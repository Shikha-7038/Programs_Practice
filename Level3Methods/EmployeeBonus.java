/* 11. Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
a. Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
b. Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
c. Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
d. Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
 */

package Level3Methods;

import java.util.Random;

public class EmployeeBonus {

    // Generate employee data: [salary, yearsOfService]
    public static double[][] generateEmployeeData(int n) {
        Random rand = new Random();
        double[][] data = new double[n][2]; // [salary, years]

        for (int i = 0; i < n; i++) {
            // 5-digit salary between 10000 and 99999
            int salary = 10000 + rand.nextInt(90000);
            // years of service between 1 and 15
            int years = 1 + rand.nextInt(15);

            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Calculate new salary & bonus
    public static double[][] calculateBonus(double[][] data) {
        int n = data.length;
        double[][] result = new double[n][3]; // [oldSalary, newSalary, bonus]

        for (int i = 0; i < n; i++) {
            double oldSalary = data[i][0];
            double years = data[i][1];

            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercent;
            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = newSalary;
            result[i][2] = bonus;
        }
        return result;
    }

    // Display in tabular format & calculate totals
    public static void displayResults(double[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("%-10s %-12s %-12s %-12s %-12s%n", 
                          "EmpID", "OldSalary", "Years", "NewSalary", "Bonus");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            double oldSalary = result[i][0];
            double newSalary = result[i][1];
            double bonus = result[i][2];
            int years = (int) data[i][1];

            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-12.2f %-12d %-12.2f %-12.2f%n", 
                              (i + 1), oldSalary, years, newSalary, bonus);
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-12s %-12.2f %-12.2f%n", 
                          "TOTAL", totalOld, "", totalNew, totalBonus);
    }

    public static void main(String[] args) {
        int n = 10; // Number of employees
        double[][] employeeData = generateEmployeeData(n);
        double[][] result = calculateBonus(employeeData);
        displayResults(employeeData, result);
    }
}
