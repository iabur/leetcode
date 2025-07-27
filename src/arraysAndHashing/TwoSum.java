package arraysAndHashing;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> solutionPair = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (solutionPair.containsKey(nums[i])) {
                return new int[]{i, solutionPair.get(nums[i])};
            } else {
                solutionPair.put(target - nums[i], i);
            }
        }
        return null;
    }
}