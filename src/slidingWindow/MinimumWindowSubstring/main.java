package slidingWindow.MinimumWindowSubstring;

public class main {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        Solution solution = new Solution();
        System.out.println(solution.minWindow(s, t));

    }
}
