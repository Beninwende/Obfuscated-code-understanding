import java.util.List;
import java.util.ArrayList;

public class PairWise {
    public static class Pair<T, U> {
        public final T first;
        public final U second;
        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }

    public static <T> List<Pair<T, T>> pairWise(List<T> list) {
        List<Pair<T, T>> result = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            T current = list.get(i);
            T next = list.get(i + 1);
            result.add(new Pair<>(current, next));
        }
        return result;
    }
}
