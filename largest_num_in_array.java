package Arrays;

import java.util.Scanner;

public class largest_num_in_array {
    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE; // + infinty
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }

        }
        System.out.println("smalllest num : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the element of Array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("largest value is : " + getLargest(num));
        sc.close();
    }
}