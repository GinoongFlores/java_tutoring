import java.util.*;

public class Ex1_Blueprint {

    /*
     * =====================
     * Jagged 3D Array Refresher
     * =====================
     * A 3D array in Java is int[][][] data.
     * Think: data[layer][row][col]
     *
     * IMPORTANT:
     * In Java, multidimensional arrays are arrays-of-arrays.
     * So a 3D array can be jagged in multiple ways:
     * - layers can have different numbers of rows
     * - rows can have different numbers of columns
     *
     * Visualization of the example below (real values):
     *
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

    public static void main(String[] args) {
        // 1) Create a jagged 3D array (layers and rows can have different lengths)
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

        // 2) Choose a position (layer, row, col)
        int layer = 0;
        int row = 0;
        int col = 2;

        // 3) Print the chosen number (data[layer][row][col])

        // 4) Call isRowLeader3D(data, layer, row, col)
        // Definition: chosen must be STRICTLY greater than every number to the RIGHT
        // in the SAME row, SAME layer.

        // 5) Call isColumnLeader3D(data, layer, row, col)
        // Definition: chosen must be STRICTLY greater than every number BELOW it
        // in the SAME layer, SAME column.
        // Jagged rule: when checking lower rows, only compare if that row has this col.

        // 6) Call isDepthLeader3D(data, layer, row, col)
        // Definition: chosen must be STRICTLY greater than every number in DEEPER layers
        // at the SAME (row, col).
        // Jagged rule: if a deeper layer does not have that row or col, skip it.

        // 7) Print results like:
        // Chosen number: 3
        // Row leader? true
        // Column leader? true
        // Depth leader? false

        // STUDENT TODO: Write the printing logic in main.
    }

    public static boolean isRowLeader3D(int[][][] data, int layer, int row, int col) {
        // 1) chosen = data[layer][row][col]
        // 2) loop j from col + 1 to end of that row (data[layer][row].length)
        // 3) if any value >= chosen, return false
        // 4) return true
        return false;
    }

    public static boolean isColumnLeader3D(int[][][] data, int layer, int row, int col) {
        // 1) chosen = data[layer][row][col]
        // 2) loop r from row + 1 to last row in that layer (data[layer].length)
        // 3) if (col < data[layer][r].length) compare data[layer][r][col]
        // 4) if any value >= chosen, return false
        // 5) return true
        return false;
    }

    public static boolean isDepthLeader3D(int[][][] data, int layer, int row, int col) {
        // 1) chosen = data[layer][row][col]
        // 2) loop L from layer + 1 to last layer (data.length)
        // 3) skip if row >= data[L].length (that layer doesn't have this row)
        // 4) skip if col >= data[L][row].length (that row doesn't have this col)
        // 5) compare data[L][row][col]
        // 6) if any value >= chosen, return false
        // 7) return true
        return false;
    }
}
