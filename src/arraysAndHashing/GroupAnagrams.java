package arraysAndHashing;

import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupString = new HashMap<>();
        for (String str : strs) {
//            String sortedString = Stream.of(str.split("")).sorted().collect(Collectors.joining());
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            groupString.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(groupString.values());
    }
}