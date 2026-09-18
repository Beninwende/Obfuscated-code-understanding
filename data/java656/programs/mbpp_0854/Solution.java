import java.util.List;

public class HeapUtil {
    public static <T extends Comparable<? super T>> List<T> rawHeap(List<T> rawheap) {
        int n = rawheap.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(rawheap, i, n);
        }
        return rawheap;
    }

    private static <T extends Comparable<? super T>> void siftDown(List<T> heap, int i, int n) {
        T val = heap.get(i);
        int parent = i;
        while (true) {
            int left = 2 * parent + 1;
            if (left >= n) break;
            int right = left + 1;
            int child = (right < n && heap.get(right).compareTo(heap.get(left)) < 0) ? right : left;
            T childVal = heap.get(child);
            if (childVal.compareTo(val) >= 0) break;
            heap.set(parent, childVal);
            parent = child;
        }
        heap.set(parent, val);
    }
}
