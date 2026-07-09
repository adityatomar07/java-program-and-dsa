package multiDimensionalArray;

import java.util.Scanner;

public class creating_2D_Array {
    // function for Searching key
    public static boolean SearchingKey(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length; // this is for row
        int m = matrix[0].length; // this is for column
        // input method:--
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element of your matrix(n*m): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }
        // output method:--
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the key to search: ");
        int key = sc.nextInt();
        SearchingKey(matrix, key);//call method
        sc.close();
    }
}
