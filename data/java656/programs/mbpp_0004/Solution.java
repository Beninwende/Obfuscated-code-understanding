import java.util.*;

public class HeapQueueLargest {
    public static List<Integer> heapQueueLargest(List<Integer> nums, int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > n) {
                minHeap.poll();
            }
        }
        List<Integer> result = new ArrayList<>(minHeap);
        result.sort(Collections.reverseOrder());
        return result;
    }
}
