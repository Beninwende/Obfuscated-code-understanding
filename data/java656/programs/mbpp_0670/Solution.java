import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TrendChecker {
    public static boolean decreasingTrend(List<Integer> nums) {
        List<Integer> sorted = new ArrayList<>(nums);
        Collections.sort(sorted);
        if (sorted.equals(nums)) {
            return true;
        } else {
            return false;
        }
    }
}
