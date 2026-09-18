import java.util.List;
import java.util.ArrayList;

public class MergeUtils {
    public static List<Integer> combineLists(List<Integer> num1, List<Integer> num2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < num1.size() && j < num2.size()) {
            if (num1.get(i) <= num2.get(j)) {
                merged.add(num1.get(i++));
            } else {
                merged.add(num2.get(j++));
            }
        }
        while (i < num1.size()) {
            merged.add(num1.get(i++));
        }
        while (j < num2.size()) {
            merged.add(num2.get(j++));
        }
        return merged;
    }
}
