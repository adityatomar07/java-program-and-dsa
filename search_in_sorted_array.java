package multiDimensionalArray;

public class search_in_sorted_array {
    public static boolean StairCaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key founded : (" + row + " ," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 30, 45 },
                { 27, 29, 37, 38 },
                { 32, 33, 39, 50 }
        };
        int key = 20;
        System.out.println(StairCaseSearch(matrix, key));
    }
}
