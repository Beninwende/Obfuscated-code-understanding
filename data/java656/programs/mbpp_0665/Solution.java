import java.util.List;
import java.util.ArrayList;

public class ListUtils {
    public static List<Integer> moveLast(List<Integer> numList) {
        if (numList == null || numList.isEmpty()) {
            return new ArrayList<>();
        }
        Integer first = numList.get(0);
        int count = 0;
        for (Integer num : numList) {
            if (num.equals(first)) {
                count++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Integer num : numList) {
            if (!num.equals(first)) {
                result.add(num);
            }
        }
        for (int i = 0; i < count; i++) {
            result.add(first);
        }
        return result;
    }
}
