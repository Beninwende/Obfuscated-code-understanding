import java.util.List;

public class RightInsertion {
    public static <T extends Comparable<? super T>> int rightInsertion(List<T> a, T x) {
        int lo = 0;
        int hi = a.size();
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (a.get(mid).compareTo(x) <= 0) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}
