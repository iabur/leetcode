import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

class FrequentElement {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        priorityQueue.addAll(frequencyMap.entrySet());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = Objects.requireNonNull(priorityQueue.poll()).getKey();
        }
        return result;

    }
}