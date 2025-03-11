public class BinarySearch {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length -1;

        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                startIndex = mid + 1;
            } else if (target < nums[mid]) {
                endIndex = mid - 1;
            }
        }
        return -1;
    }
}
