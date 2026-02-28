import java.util.*;

public class Ex1_Blueprint {

    /*
     * Jagged (Ragged) 2D Array Refresher:
     *
     * data is NOT a rectangle. Each row can have a different length.
     * Example data below:
     *
     * j: 0 1 2 3
     * --------------------
     * i=0 | 1 2 3 2
     * i=1 | 5 6 2
     * i=2 | 8 9
     * i=3 | 10 11 1 13
     *
     * So for column checks you must first verify: col < data[i].length
     */

    public static void main(String[] args) {
        // 1) Create a jagged 2D array (rows have different lengths)
        int[][] data = {
                { 1, 2, 3, 2 },
                { 5, 6, 2 },
                { 8, 9 },
                { 10, 11, 1, 13 }
        };

        // 2) Choose a position (row, col)
        int row = 0;
        int col = 2;

        // 3) Print the chosen number
        // (Example: chosen is data[0][2] which is 3)

        // 4) Call isRowLeader(data, row, col)
        // Definition: chosen number must be STRICTLY greater than every number to the
        // RIGHT
        // in the SAME row.

        // 5) Call isColumnLeader(data, row, col)
        // Definition: chosen number must be STRICTLY greater than every number BELOW it
        // in the SAME column.
        // IMPORTANT (jagged rule): if a lower row does not have that column index, SKIP
        // that row.

        // 6) Print results like:
        // Chosen number: 3
        // Row leader? true
        // Column leader? true

        // STUDENT TODO: Write the printing logic in main.
    }

    // STUDENT TODO:
    // Return true if data[row][col] is greater than every value to its right in
    // data[row].
    public static boolean isRowLeader(int[][] data, int row, int col) {
        // 1) Save chosenNumber = data[row][col]
        // 2) Loop j from col + 1 to the last index of that same row
        // 3) If you find a value >= chosenNumber, return false
        // 4) If loop ends, return true
        return false;
    }

    // STUDENT TODO:
    // Return true if data[row][col] is greater than every value below it in the
    // same column.
    // Skip rows that do not have that column.
    public static boolean isColumnLeader(int[][] data, int row, int col) {
        // 1) Save chosenNumber = data[row][col]
        // 2) Loop i from row + 1 down to the last row
        // 3) If this row has the column (col < data[i].length), compare data[i][col]
        // 4) If you find a value >= chosenNumber, return false
        // 5) If loop ends, return true
        return false;
    }
}
