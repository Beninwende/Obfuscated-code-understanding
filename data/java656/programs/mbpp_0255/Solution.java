import java.util.ArrayList;
import java.util.List;

public class ColorCombinations {
    public static List<List<String>> combinationsColors(List<String> l, int n) {
        List<List<String>> result = new ArrayList<>();
        backtrack(l, n, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(List<String> l, int n, int start, List<String> current, List<List<String>> result) {
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < l.size(); i++) {
            current.add(l.get(i));
            backtrack(l, n, i, current, result);
            current.remove(current.size() - 1);
        }
    }
}
