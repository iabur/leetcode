package slidingWindow;

import java.util.HashMap;
import java.util.Map;

class LongestSubStringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> keyMap = new HashMap<>();
        int maxLength = 0;
        int startingPoint = 0;
        for (int i = 0; i < s.length(); i++) {
            if (keyMap.containsKey(s.charAt(i))) {
                startingPoint = Math.max(startingPoint, keyMap.get(s.charAt(i)) + 1);
            }
            maxLength = Math.max(i - startingPoint + 1, maxLength);
            keyMap.put(s.charAt(i), i);

        }
        return maxLength;
    }
}