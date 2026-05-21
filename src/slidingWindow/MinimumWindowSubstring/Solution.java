package slidingWindow.MinimumWindowSubstring;

import java.util.*;

class Solution {

    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int minWindow = Integer.MAX_VALUE;
        int needCount = need.size();

        int start = 0;
        Map<Character, Integer> window = new HashMap<>();
        int having = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            window.put(rightChar, window.getOrDefault(rightChar, 0) + 1);
            if (need.containsKey(rightChar) && window.get(rightChar).intValue() == need.get(rightChar).intValue()) {
                having++;
            }

            while (having == needCount) {
                int windowSize = right - left + 1;
                if (windowSize < minWindow) {
                    minWindow = windowSize;
                    start = left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
                    having--;
                }
                left++;
            }
        }
        return minWindow == Integer.MAX_VALUE ? "" : s.substring(start, start + minWindow);
    }
}