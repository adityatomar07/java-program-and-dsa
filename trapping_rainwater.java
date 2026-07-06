package Arrays;

public class trapping_rainwater {
    public static int trappedRainWater(int height[]) {
        int n = height.length;
        // this is for left max boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // now calculate right side max boundary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedwater = 0;
        // loop for finding trapped water
        for (int i = 0; i < n; i++) {
            // for water level = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Result : " + trappedRainWater(height));

    }
}
