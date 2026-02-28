import java.util.*;

public class Ex2_SyntaxPractice {

    /*
     * Same idea as Ex1, but now with fill-in-the-blanks.
     *
     * data[layer][row][col]
     * - Row leader: check to the RIGHT in same layer+row
     * - Column leader: check BELOW in same layer+col (skip rows without col)
     * - Depth leader: check DEEPER layers at same (row,col) (skip layers missing row/col)
     */

    public static void main(String[] args) {
        int[][][] data = {
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

        int layer = 0;
        int row = 0;
        int col = 2;

        int chosen = data[_______][_______][_______];

        System.out.println("Chosen number: " + _______);
        System.out.println("Row leader? " + isRowLeader3D(data, layer, row, col));
        System.out.println("Column leader? " + isColumnLeader3D(data, layer, row, col));
        System.out.println("Depth leader? " + isDepthLeader3D(data, layer, row, col));
    }

    public static boolean isRowLeader3D(int[][][] data, int layer, int row, int col) {
        int chosen = data[layer][row][col];

        for (int j = _______ ; j < _______ ; j++) {
            if (data[layer][row][j] >= _______) {
                return _______;
            }
        }
        return _______;
    }

    public static boolean isColumnLeader3D(int[][][] data, int layer, int row, int col) {
        int chosen = data[layer][row][col];

        for (int r = _______ ; r < _______ ; r++) {
            if (_______ < data[layer][r].length) {
                if (data[layer][r][_______] >= chosen) {
                    return _______;
                }
            }
        }
        return _______;
    }

    public static boolean isDepthLeader3D(int[][][] data, int layer, int row, int col) {
        int chosen = data[layer][row][col];

        for (int L = _______ ; L < _______ ; L++) {
            if (row >= data[L].length) {
                continue;
            }
            if (col >= data[L][row].length) {
                continue;
            }
            if (data[L][row][col] >= chosen) {
                return _______;
            }
        }
        return _______;
    }
}
