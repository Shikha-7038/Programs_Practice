/* 13. Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations.
a. Write a Method to create a random matrix taking rows and columns as parameters
b. Write a Method to add two matrices
c. Write a Method to subtract two matrices
d. Write a Method to multiply two matrices
e. Write a Method to find the transpose of a matrix     
f. Write a Method to find the determinant of a 2x2 matrix
g. Write a Method to find the determinant of a 3x3 matrix
h. Write a Method to find the inverse of a 2x2 matrix
i. Write a Method to find the inverse of a 3x3 matrix
j. Write a Method to display a matrix
 */

package Level3Methods;

import java.util.Random;

public class MatrixOperations {

    // Generate random n x n matrix
    public static double[][] generateMatrix(int n) {
        Random rand = new Random();
        double[][] mat = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = rand.nextInt(10); // values 0–9
            }
        }
        return mat;
    }

    // Display matrix
    public static void displayMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row) {
                System.out.printf("%8.2f ", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Addition
    public static double[][] add(double[][] A, double[][] B) {
        int n = A.length;
        double[][] C = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    // Subtraction
    public static double[][] subtract(double[][] A, double[][] B) {
        int n = A.length;
        double[][] C = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }

    // Multiplication
    public static double[][] multiply(double[][] A, double[][] B) {
        int n = A.length;
        double[][] C = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    // Transpose
    public static double[][] transpose(double[][] A) {
        int n = A.length;
        double[][] T = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                T[j][i] = A[i][j];
        return T;
    }

    // Determinant (2x2 and 3x3)
    public static double determinant(double[][] A) {
        int n = A.length;
        if (n == 2) {
            return (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
        } else if (n == 3) {
            return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
                 - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
                 + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
        }
        throw new IllegalArgumentException("Only 2x2 or 3x3 matrices supported.");
    }

    // Inverse for 2x2
    public static double[][] inverse2x2(double[][] A) {
        double det = determinant(A);
        if (det == 0) throw new ArithmeticException("Matrix is singular (no inverse).");

        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1] / det;
        inv[0][1] = -A[0][1] / det;
        inv[1][0] = -A[1][0] / det;
        inv[1][1] = A[0][0] / det;
        return inv;
    }

    // Inverse for 3x3 (Adjoint method)
    public static double[][] inverse3x3(double[][] A) {
        double det = determinant(A);
        if (det == 0) throw new ArithmeticException("Matrix is singular (no inverse).");

        double[][] adj = new double[3][3];

        adj[0][0] =  (A[1][1]*A[2][2] - A[1][2]*A[2][1]);
        adj[0][1] = -(A[1][0]*A[2][2] - A[1][2]*A[2][0]);
        adj[0][2] =  (A[1][0]*A[2][1] - A[1][1]*A[2][0]);

        adj[1][0] = -(A[0][1]*A[2][2] - A[0][2]*A[2][1]);
        adj[1][1] =  (A[0][0]*A[2][2] - A[0][2]*A[2][0]);
        adj[1][2] = -(A[0][0]*A[2][1] - A[0][1]*A[2][0]);

        adj[2][0] =  (A[0][1]*A[1][2] - A[0][2]*A[1][1]);
        adj[2][1] = -(A[0][0]*A[1][2] - A[0][2]*A[1][0]);
        adj[2][2] =  (A[0][0]*A[1][1] - A[0][1]*A[1][0]);

        // Transpose of cofactor matrix (adjoint) divided by determinant
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[i][j] / det;

        return inv;
    }

    public static void main(String[] args) {
        // Generate two 3x3 matrices
        double[][] A = generateMatrix(3);
        double[][] B = generateMatrix(3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("Matrix B:");
        displayMatrix(B);

        // Addition
        System.out.println("A + B:");
        displayMatrix(add(A, B));

        // Subtraction
        System.out.println("A - B:");
        displayMatrix(subtract(A, B));

        // Multiplication
        System.out.println("A * B:");
        displayMatrix(multiply(A, B));

        // Transpose
        System.out.println("Transpose of A:");
        displayMatrix(transpose(A));

        // Determinant
        double detA = determinant(A);
        System.out.println("Determinant of A = " + detA);

        // Inverse (if determinant != 0)
        try {
            double[][] invA = inverse3x3(A);
            System.out.println("Inverse of A:");
            displayMatrix(invA);
        } catch (Exception e) {
            System.out.println("Inverse not possible: " + e.getMessage());
        }
    }
}
