import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    public static <T> List<T> reverseArrayUpToK(List<T> input, int k) {
        List<T> result = new ArrayList<>();
        for (int i = k - 1; i >= 0; i--) {
            result.add(input.get(i));
        }
        for (int i = k; i < input.size(); i++) {
            result.add(input.get(i));
        }
        return result;
    }
}
