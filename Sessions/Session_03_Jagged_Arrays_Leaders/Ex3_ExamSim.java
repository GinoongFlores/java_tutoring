import java.util.*;

public class Ex3_ExamSim {

    /*
     * =====================
     * Problem Description
     * =====================
     * You are given a jagged (ragged) 2D array of integers.
     *
     * A position (row, col) is a "DUAL LEADER" if:
     * 1) Row leader rule:
     * data[row][col] is strictly greater than every value to the RIGHT in the same
     * row.
     * 2) Column leader rule:
     * data[row][col] is strictly greater than every value BELOW it in the same
     * column.
     * If a lower row does not have that column index, you SKIP that row.
     *
     * Your task: count how many DUAL LEADERS exist in the entire jagged array.
     *
     * =====================
     * Required Method
     * =====================
     * Write this method:
     * public static int solve(int[][] data)
     *
     * It should return the number of dual leaders.
     *
     * =====================
     * Example Visualization (Test 1)
     * =====================
     * j: 0 1 2 3
     * --------------------
     * i=0 | 1 2 3 2
     * i=1 | 5 6 2
     * i=2 | 8 9
     * i=3 | 10 11 1 13
     */

    // STUDENT TODO: Write this method above main until all tests pass.
    public static int solve(int[][] data) {
        return 0;
    }

    // TEST HARNESS (Do not edit)
    public static void main(String[] args) {
        int[][] test1 = {
                { 1, 2, 3, 2 },
                { 5, 6, 2 },
                { 8, 9 },
                { 10, 11, 1, 13 }
        };

        int[][] test2 = {
                { 4, 1 },
                { 3, 2, 5 },
                { 9 },
                { 1, 0, 2 }
        };

        int[][] test3 = {
                { 7 },
                { 6 },
                { 5 },
                { 4 }
        };

        runTest("Test 1", test1, 3);
        runTest("Test 2", test2, 3);
        runTest("Test 3", test3, 4);
    }

    private static void runTest(String name, int[][] data, int expected) {
        int actual = solve(data);
        if (actual == expected) {
            System.out.println(name + ": PASS");
        } else {
            System.out.println(name + ": FAIL (Expected " + expected + ", got " + actual + ")");
        }
    }
}
