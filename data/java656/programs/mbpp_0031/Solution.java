import java.util.*;

public class Solution {
    public static List<Integer> func(List<List<Integer>> nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (List<Integer> row : nums) {
            for (Integer i : row) {
                freq.put(i, freq.getOrDefault(i, 0) + 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            Comparator.comparingInt(Map.Entry::getValue)
        );
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (heap.size() < k) {
                heap.offer(entry);
            } else if (entry.getValue() > heap.peek().getValue()) {
                heap.poll();
                heap.offer(entry);
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!heap.isEmpty()) {
            result.add(heap.poll().getKey());
        }
        return result;
    }
}
