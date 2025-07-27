package greedy;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReach = nums.length -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= maxReach) {
                maxReach = i;
            }
        }
        return maxReach == 0;
    }
}

