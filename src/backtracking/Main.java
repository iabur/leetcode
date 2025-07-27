package backtracking;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        int[] array = {2,3,6,7};
        int candidate = 7;
        List<List<Integer>> result = combinationSum.combinationSum(array, candidate);
        System.out.println(result);
    }
}
