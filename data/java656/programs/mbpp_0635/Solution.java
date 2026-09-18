import java.util.*;

public class HeapSort {
    public static <T extends Comparable<? super T>> List<T> heapSort(Collection<T> iterable) {
        PriorityQueue<T> h = new PriorityQueue<>();
        for (T value : iterable) {
            h.add(value);
        }
        List<T> result = new ArrayList<>();
        while (!h.isEmpty()) {
            result.add(h.poll());
        }
        return result;
    }
}
