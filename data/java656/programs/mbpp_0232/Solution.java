import java.util.*;

public class LargestN {
    public static <T extends Comparable<? super T>> List<T> larg_nnum(List<T> list1, int n) {
        PriorityQueue<T> pq = new PriorityQueue<>(n);
        for (T item : list1) {
            if (pq.size() < n) {
                pq.offer(item);
            } else if (item.compareTo(pq.peek()) > 0) {
                pq.poll();
                pq.offer(item);
            }
        }
        List<T> result = new ArrayList<>(pq);
        result.sort(Collections.reverseOrder());
        return result;
    }
}
