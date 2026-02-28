package samples;

class rowleader {
    public static void main(String[] args) {
        int[][] data = {
                { 1, 2, 3, 2 },
                { 5, 6, 2 },
                { 8, 9 },
                { 10, 11, 1, 13 }
        };

        int row = 0;
        int col = 2;
        int chosenNumber = data[row][col];
        System.out.println("Row leader is: " + isRowleader(data, row, col, chosenNumber));
        System.out.println("Column leader is: " + isColumnleader(data, row, col, chosenNumber));
    }

    static boolean isRowleader(int[][] data, int row, int col, int chosenNumber) {
        boolean isRowleader = true;

        for (int j = col + 1; j < data[row].length; j++) {
            if (data[row][j] >= chosenNumber) {
                isRowleader = false;
                break;
            }
        }
        return isRowleader;
    }

    static boolean isColumnleader(int[][] data, int row, int col, int chosenNumber) {
        for (int i = row + 1; i < data.length; i++) {
            if (col < data[i].length) {
                if (data[i][col] >= chosenNumber) {
                    return false;
                }
            }
        }
        return true;
    }

}