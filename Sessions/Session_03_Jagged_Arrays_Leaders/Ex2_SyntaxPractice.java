import java.util.*;

public class Ex2_SyntaxPractice {

    /*
     * Same problem as Ex1, but now fill in the missing Java syntax.
     *
     * Definition:
     * - Row leader: chosen is strictly greater than every value to its RIGHT in the
     * same row.
     * - Column leader: chosen is strictly greater than every value BELOW it in the
     * same column.
     * (Skip rows that do not have that column index.)
     */

    public static void main(String[] args) {
        int[][] data = {
                { 1, 2, 3, 2 },
                { 5, 6, 2 },
                { 8, 9 },
                { 10, 11, 1, 13 }
        };

        int row = 0;
        int col = 2;

        int chosenNumber = data[_______][_______];

        System.out.println("Chosen number: " + _______);
        System.out.println("Row leader? " + isRowLeader(data, row, col));
        System.out.println("Column leader? " + isColumnLeader(data, row, col));
    }

    public static boolean isRowLeader(int[][] data, int row, int col) {
        int chosenNumber = data[row][col];

        for (int j = _______; j < _______; j++) {
            if (data[row][j] >= _______) {
                return _______;
            }
        }
        return _______;
    }

    public static boolean isColumnLeader(int[][] data, int row, int col) {
        int chosenNumber = data[row][col];

        for (int i = _______; i < _______; i++) {
            // jagged safety check: only compare if this row has the column index
            if (_______ < data[i].length) {
                if (data[i][_______] >= chosenNumber) {
                    return _______;
                }
            }
        }
        return _______;
    }
}
