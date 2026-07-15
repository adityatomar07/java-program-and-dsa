package bit_manipulation;

public class fast_exponatition {
    public static int fastExpo(int n, int a) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                // lsb
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 2;// power
        int a = 5;// value
        System.out.println("result : " + fastExpo(n, a));
    }
}
