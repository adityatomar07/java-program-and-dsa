package Arrays;

import java.util.Scanner;

public class linear_search {
    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the size of Array : ");

        int n = sc.nextInt();

        int num[] = new int[n];
        System.out.println("Enter the Array element : " + n);
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enetr the key : ");
        int key = sc.nextInt();
        int index = linearSearch(num, key);
        if (index == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println("key is at index : " + index);
        }
        sc.close();
    }
}
