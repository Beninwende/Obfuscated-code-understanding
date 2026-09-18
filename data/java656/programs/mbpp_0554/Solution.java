import java.util.List;
import java.util.ArrayList;

public class Split {
    public static List<Integer> split(List<Integer> list) {
        List<Integer> odLi = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 != 0) {
                odLi.add(i);
            }
        }
        return odLi;
    }
}
