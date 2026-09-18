import java.util.ArrayList;
import java.util.List;

public class DuplicateFinder {
    public static List<Integer> repeat(int[] x) {
        int size = x.length;
        List<Integer> repeated = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (x[i] == x[j] && !repeated.contains(x[i])) {
                    repeated.add(x[i]);
                }
            }
        }
        return repeated;
    }
}
