// Save as: Ex4_BookstoreSales.java
public class Ex4_BookstoreSales {

    /*
     * Problem Description
     * -------------------
     * You work at a bookstore that tracks daily sales for different book genres.
     *
     * You have a 2D array where:
     * - Each row represents a day of the week (0=Monday, 1=Tuesday, etc.)
     * - Each column represents a genre (0=Fiction, 1=Mystery, 2=Romance)
     * - The value is the number of books sold
     *
     * Example visualization:
     * Fiction Mystery Romance
     * Monday 5 3 2
     * Tuesday 4 5 1
     * Wednesday 6 2 3
     *
     * sales[0][0] = 5 (5 Fiction books sold on Monday)
     * sales[1][1] = 5 (5 Mystery books sold on Tuesday)
     * sales[2][2] = 3 (3 Romance books sold on Wednesday)
     *
     * Task:
     * Write a method that counts how many days sold MORE than a target number
     * of books in total (across all genres).
     *
     * Example:
     * If target = 10, we check each day's total:
     * - Monday: 5+3+2 = 10 (not more than 10, doesn't count)
     * - Tuesday: 4+5+1 = 10 (not more than 10, doesn't count)
     * - Wednesday: 6+2+3 = 11 (more than 10, counts!)
     * Result: 1 day
     *
     * Required Method
     * ---------------
     * public static int countHighSalesDays(int[][] sales, int target)
     *
     * Returns: the number of days where total sales > target
     */

    // STUDENT TODO: Write this method
    public static int countHighSalesDays(int[][] sales, int target) {
        // Your code here
        return 0;
    }

    // TEST HARNESS (Do not edit)
    public static void main(String[] args) {

        // Test 1: Basic case
        int[][] sales1 = {
                { 5, 3, 2 }, // Monday: 10 total
                { 4, 5, 1 }, // Tuesday: 10 total
                { 6, 2, 3 } // Wednesday: 11 total
        };
        check("Test 1 (target=10)", countHighSalesDays(sales1, 10), 1);

        // Test 2: All days qualify
        int[][] sales2 = {
                { 10, 5, 3 }, // Day 1: 18 total
                { 8, 7, 2 } // Day 2: 17 total
        };
        check("Test 2 (target=15)", countHighSalesDays(sales2, 15), 2);

        // Test 3: No days qualify
        int[][] sales3 = {
                { 1, 1, 1 }, // Day 1: 3 total
                { 2, 2, 2 } // Day 2: 6 total
        };
        check("Test 3 (target=10)", countHighSalesDays(sales3, 10), 0);

        // Test 4: Single day
        int[][] sales4 = {
                { 5, 5, 5 } // Day 1: 15 total
        };
        check("Test 4 (target=14)", countHighSalesDays(sales4, 14), 1);

        // Test 5: Higher target
        int[][] sales5 = {
                { 10, 10, 10 }, // Day 1: 30 total
                { 5, 5, 5 }, // Day 2: 15 total
                { 8, 8, 8 } // Day 3: 24 total
        };
        check("Test 5 (target=20)", countHighSalesDays(sales5, 20), 2);
    }

    private static void check(String name, int actual, int expected) {
        if (actual == expected) {
            System.out.println(name + ": PASS");
        } else {
            System.out.println(name + ": FAIL (Expected " + expected + ", got " + actual + ")");
        }
    }
}
