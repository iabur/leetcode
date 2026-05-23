package binarySearch.SearchInRotatedSortedArray;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        Solution solution = new Solution();
        System.out.println(solution.search(nums, target));
    }
}
