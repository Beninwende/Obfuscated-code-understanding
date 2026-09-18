import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ConsecutiveChecker {
    public static boolean checkConsecutive(List<Integer> l) {
        int min = Collections.min(l);
        int max = Collections.max(l);
        List<Integer> sortedList = new ArrayList<>(l);
        Collections.sort(sortedList);
        if (sortedList.size() != max - min + 1) {
            return false;
        }
        for (int i = 0; i < sortedList.size(); i++) {
            if (sortedList.get(i) != min + i) {
                return false;
            }
        }
        return true;
    }
}
