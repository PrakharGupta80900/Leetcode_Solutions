class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        // 3 possible ways
        int removeFromLeft = maxIndex + 1;

        int removeFromRight = n - minIndex;

        int removeBothSides = (minIndex + 1) + (n - maxIndex);

        return Math.min(removeFromLeft,
                Math.min(removeFromRight, removeBothSides));
    }
}