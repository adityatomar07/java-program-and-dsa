package Arrays;

import java.util.Scanner;

public class kadanes_algo {
    public static int kadanesAlgo(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            if (cs < 0) {
                cs = 0;

            }
            ms = Math.max(cs, ms);
        }
        // return the maximum subarray sum
        return ms;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the Element of Array : ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        // int num[] = { 4, -1, -2, 5, -3 };
        int result = kadanesAlgo(num);
        System.out.println("result : " + result);
        sc.close();
    }
}
