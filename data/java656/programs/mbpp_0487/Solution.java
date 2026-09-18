import java.util.List;

public class TupleSorter {
    public static <T extends Comparable<? super T>> List<T[]> sortTuples(List<T[]> tuples) {
        int n = tuples.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                T[] current = tuples.get(j);
                T[] next = tuples.get(j + 1);
                if (current[current.length - 1].compareTo(next[next.length - 1]) > 0) {
                    tuples.set(j, next);
                    tuples.set(j + 1, current);
                }
            }
        }
        return tuples;
    }
}
