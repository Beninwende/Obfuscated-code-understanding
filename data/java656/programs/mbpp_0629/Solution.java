import java.util.List;
import java.util.ArrayList;

public class SplitList {
    public static List<Integer> split(List<Integer> list) {
        List<Integer> evLi = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                evLi.add(i);
            }
        }
        return evLi;
    }
}
