import java.util.List;
import java.util.ArrayList;

public class ZipTuples {
    public static <T, U> List<Pair<T, U>> zipTuples(List<T> testTup1, List<U> testTup2) {
        List<Pair<T, U>> res = new ArrayList<>();
        int n2 = testTup2.size();
        for (int i = 0; i < testTup1.size(); i++) {
            res.add(new Pair<>(testTup1.get(i), testTup2.get(i % n2)));
        }
        return res;
    }

    public static class Pair<T, U> {
        private final T first;
        private final U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public U getSecond() {
            return second;
        }
    }
}
