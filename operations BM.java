package bit_manipulation;

import java.util.Scanner;

public class operations {
    // Get i th bit
    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Set i th bit
    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    // Clear i th bit
    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    // Update i th bit
    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }
        // method 2 to update
        n = clearIthBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;

    }

    // Clear range of bits
    public static int clearRangeIthBit(int n, int i, int j) {
        int a = ((~0 << (j + 1)));
        int b = (1 << i) - 1;
        int bitmask = a / b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the index element : ");
        int i = sc.nextInt();
        System.out.println("Enter the range value: ");
        int j = sc.nextInt();
        System.out.println("the bit at index " + i + " is : " + clearRangeIthBit(n, i, j));
        sc.close();
    }
}
