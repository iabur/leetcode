import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedArraysOfString = new String[strs.length];
//        Map<String, String> stringHashMap = new HashMap<>();
        Map<String, List<String>> groupString = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            sortedArraysOfString[i] = Stream.of(strs[0].split(""))
                    .sorted()
                    .collect(Collectors.joining());
//            stringHashMap.put(strs[i], sortedArraysOfString[i]);
            List<String> group = groupString.get(sortedArraysOfString[i]);
            if (group != null) {
                group.add(strs[i]);
                groupString.put(sortedArraysOfString[i], group);
            } else {
                groupString.put(sortedArraysOfString[i], List.of(strs[i]));
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : groupString.keySet()) {
            result.add(groupString.get(key));
        }

        return result;
    }
}