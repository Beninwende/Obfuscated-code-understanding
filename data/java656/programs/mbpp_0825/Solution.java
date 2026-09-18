import java.util.List;
import java.util.ArrayList;

public class Utils {
    public static <T> List<T> accessElements(List<T> nums, List<Integer> listIndex) {
        List<T> result = new ArrayList<>();
        for (Integer i : listIndex) {
            result.add(nums.get(i));
        }
        return result;
    }
}
