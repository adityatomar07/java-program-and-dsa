package Arrays;

import java.util.Scanner;

public class reverse_array {
    public static void reverse(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            // swap
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        // int num[] = { 2, 3, 4, 5, 7, 8, 9 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the element of Array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
            sc.close();
        }

    }
}
