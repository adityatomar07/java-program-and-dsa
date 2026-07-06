package Arrays;

public class pairs_in_arrays {
    public static void printPairs(int num[]) {
        int tp = 0;
        for (int i = 0; i < num.length; i++) {
            int current = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.println("(" + current + "," + num[j] + ")");
            }
            tp++;
            System.out.println();
        }
        System.out.println("total pair : " + tp);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        printPairs(num);
    }
}
