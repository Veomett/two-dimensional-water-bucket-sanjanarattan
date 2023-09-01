
public class TwoDimBucketStarterCode {

    public static void main(String[] args) {
        int[] heights = {3, 5, 4, 8, 7};
        System.out.println("max height should be 3, and it is " + findMaxArea(heights));
    }

    public static int findMaxArea(int[] height) {
        int max = 0; // Initialize max area
        int currMax; // Initialize current max area
        int minY; // Initialize minimum y-value between two lines

        for (int i = 0; i < height.length; i++) {
            int[] comboArray1 = new int[]{i, height[i]};

            for (int j = i + 1; j < height.length; j++) {
                int[] comboArray2 = new int[]{j, height[j]};

                // Find the minimum y-value between two lines
                minY = Math.min(height[i], height[j]);

                // Calculate the current area
                currMax = minY * (Math.abs(j - i));

                // Update max area if the current area is greater
                if (currMax > max) {
                    max = currMax;
                }
            }
        }
        return max; // Return the max area
    }
}
