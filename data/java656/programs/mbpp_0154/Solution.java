import java.util.List;
import java.util.ArrayList;

public class SpecifiedElementExtractor {
    public static <T> List<T> specifiedElement(List<List<T>> nums, int N) {
        List<T> result = new ArrayList<>();
        for (List<T> i : nums) {
            result.add(i.get(N));
        }
        return result;
    }
}
