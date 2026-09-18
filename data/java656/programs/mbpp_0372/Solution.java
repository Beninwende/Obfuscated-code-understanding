import java.util.*;

public class HeapSort {
    public static <T extends Comparable<? super T>> List<T> heapAscending(List<T> nums) {
        PriorityQueue<T> pq = new PriorityQueue<>(nums);
        List<T> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        return result;
    }
}
