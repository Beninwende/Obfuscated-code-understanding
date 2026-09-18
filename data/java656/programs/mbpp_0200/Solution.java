import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PositionMax {
    public static List<Integer> positionMax(List<Integer> list1) {
        Integer maxVal = Collections.max(list1);
        List<Integer> maxResult = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(maxVal)) {
                maxResult.add(i);
            }
        }
        return maxResult;
    }
}
