import java.util.*;

public class ChunkUtil {
    public static <T> List<List<T>> chunkTuples(List<T> testTup, int N) {
        List<List<T>> res = new ArrayList<>();
        for (int i = 0; i < testTup.size(); i += N) {
            res.add(new ArrayList<>(testTup.subList(i, Math.min(i + N, testTup.size()))));
        }
        return res;
    }
}
