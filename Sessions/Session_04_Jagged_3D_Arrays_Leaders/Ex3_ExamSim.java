import java.util.*;

public class Ex3_ExamSim {

    /*
     * =====================
     * Problem Description
     * =====================
     * You are given a jagged (ragged) 3D array of integers: int[][][] data.
     * A cell is accessed as data[layer][row][col].
     *
     * A position (layer, row, col) is a "TRIPLE LEADER" if ALL are true:
     * 1) Row leader in 3D:
     *    data[layer][row][col] is strictly greater than every value to the RIGHT
     *    in the same row (same layer, same row).
     *
     * 2) Column leader in 3D:
     *    data[layer][row][col] is strictly greater than every value BELOW it
     *    in the same layer and column (same layer, same col).
     *    If a lower row does not have that column index, skip that row.
     *
     * 3) Depth leader in 3D:
     *    data[layer][row][col] is strictly greater than every value in deeper layers
     *    at the same (row, col).
     *    If a deeper layer does not have that row or column, skip it.
     *
     * =====================
     * Required Method
     * =====================
     * Write:
     *   public static int solve(int[][][] data)
     *
     * Return the total number of TRIPLE LEADERS in the entire 3D array.
     *
     * =====================
     * Example Visualization (Test 1)
     * =====================
     * Layer 0
     *   row 0:  2   9   3
     *   row 1:  4   1
     *   row 2:  6
     *
     * Layer 1
     *   row 0:  7   1
     *   row 1:  2   0   9
     *
     * Layer 2
     *   row 0:  5   4   3   2
     */

    // STUDENT TODO: Write this method above main until all tests pass.
    public static int solve(int[][][] data) {
        return 0;
    }

    // TEST HARNESS (Do not edit)
    public static void main(String[] args) {
        int[][][] test1 = {
            {
                { 2, 9, 3 },
                { 4, 1 },
                { 6 }
            },
            {
                { 7, 1 },
                { 2, 0, 9 }
            },
            {
                { 5, 4, 3, 2 }
            }
        };

        int[][][] test2 = {
            {
                { 1, 2 },
                { 3 }
            },
            {
                { 0, 5, 4 },
                { 2, 1 }
            }
        };

        int[][][] test3 = {
            {
                { 8 }
            },
            {
                { 7 }
            },
            {
                { 6 }
            }
        };

        runTest("Test 1", test1, 9);
        runTest("Test 2", test2, 5);
        runTest("Test 3", test3, 3);
    }

    private static void runTest(String name, int[][][] data, int expected) {
        int actual = solve(data);
        if (actual == expected) {
            System.out.println(name + ": PASS");
        } else {
            System.out.println(name + ": FAIL (Expected " + expected + ", got " + actual + ")");
        }
    }
}
