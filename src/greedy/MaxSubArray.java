package greedy;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int maxSubArray = 0;

        for (int num : nums) {
            maxSubArray = Math.max(num, maxSubArray + num);
            maxSum = Math.max(maxSum, maxSubArray);
        }

        return maxSum;
    }
}
