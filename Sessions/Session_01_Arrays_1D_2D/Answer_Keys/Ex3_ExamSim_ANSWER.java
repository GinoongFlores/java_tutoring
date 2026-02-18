// Save as: Ex3_ExamSim_ANSWER.java
// ANSWER KEY - INSTRUCTOR ONLY

public class Ex3_ExamSim_ANSWER {

    /*
     * Problem Description
     * -------------------
     * You are given a 2D integer array (a "matrix"). In Java, a 2D array can be
     * jagged, meaning each row may have a different length.
     *
     * Task:
     * Return the index of the row with the largest sum.
     *
     * Rules:
     * - If the matrix has 0 rows, return -1.
     * - Sum of a row is the sum of all integers in that row.
     * - If a row is null, treat its sum as 0.
     * - If there is a tie for largest sum, return the smallest row index.
     *
     * Required Method
     * ---------------
     * public static int solve(int[][] matrix)
     *
     * Example
     * -------
     * matrix = {
     * { 1, 2, 3 },
     * { 9 },
     * { 0, 0, 0, 0 }
     * }
     * Row sums are 6, 9, 0 -> answer is 1
     */

    // STUDENT SOLUTION
    public static int solve(int[][] matrix) {
        // Edge case: empty matrix
        if (matrix.length == 0) {
            return -1;
        }

        int maxSum = Integer.MIN_VALUE;
        int maxIndex = 0;

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;

            // If row is not null, sum its elements
            if (matrix[i] != null) {
                for (int j = 0; j < matrix[i].length; j++) {
                    rowSum += matrix[i][j];
                }
            }
            // If row is null, rowSum remains 0

            // Update max if this row is strictly greater
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    // TEST HARNESS (Do not edit)
    public static void main(String[] args) {
        int[][] t1 = { { 1, 2, 3 }, { 9 }, { 0, 0, 0, 0 } };
        check("Test 1", solve(t1), 1);

        int[][] t2 = { { -5, -5 }, { -9 }, { -1, -1, -1 } }; // sums: -10, -9, -3
        check("Test 2", solve(t2), 2);

        int[][] t3 = { { 10, 0 }, { 5, 5 }, { 3, 3, 4 } }; // sums: 10, 10, 10 -> tie -> index 0
        check("Test 3", solve(t3), 0);

        int[][] t4 = { null, { 1, 2 }, null, { 3 } }; // sums: 0, 3, 0, 3 -> tie -> index 1
        check("Test 4", solve(t4), 1);

        int[][] t5 = new int[0][]; // no rows
        check("Test 5", solve(t5), -1);

        int[][] t6 = { { 100 }, {} }; // empty row sum is 0
        check("Test 6", solve(t6), 0);
    }

    private static void check(String name, int actual, int expected) {
        if (actual == expected) {
            System.out.println(name + ": PASS");
        } else {
            System.out.println(name + ": FAIL (Expected " + expected + ", got " + actual + ")");
        }
    }
}
