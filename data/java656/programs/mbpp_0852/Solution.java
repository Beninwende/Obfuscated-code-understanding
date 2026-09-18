import java.util.List;
import java.util.Iterator;

public class Utils {
    public static List<Integer> removeNegs(List<Integer> numList) {
        Iterator<Integer> iterator = numList.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            if (item < 0) {
                iterator.remove();
            }
        }
        return numList;
    }
}
