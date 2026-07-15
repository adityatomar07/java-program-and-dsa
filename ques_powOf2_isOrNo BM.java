package bit_manipulation;

import java.util.Scanner;

// question 2 : -- check the number is power of 2 or not.
public class ques_powOf2_isOrNot {
    public static boolean quesTwo(int n) {
        return (n & (n - 1)) == 0; // this formula describe the num of power 2 is or not.
    }

    // question 3 : --- Count get Bits in a Number.

    public static int quesThree(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        System.out.println("Result : " + quesThree(n));
        sc.close();
    }
}
