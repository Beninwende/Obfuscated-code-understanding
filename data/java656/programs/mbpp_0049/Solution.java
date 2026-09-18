import java.util.List;
import java.util.ArrayList;

public class Utils {
    public static <T> List<T> specifiedElement(List<List<T>> nums, int N) {
        List<T> result = new ArrayList<>();
        for (List<T> row : nums) {
            result.add(row.get(N));
        }
        return result;
    }
}
