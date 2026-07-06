package Arrays;

import java.util.Scanner;

public class bineray_search {
    public static int bineraySearch(int num[], int key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                // right side
                start = mid + 1;
            } else {
                // left
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        // int num[] = { 2, 5, 7, 8, 10, 12 };
        // int key = 12;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the Array element : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the key to search : ");
        int key = sc.nextInt();
        System.out.println("Index for key is : " + bineraySearch(num, key));
        sc.close();
    }
}
