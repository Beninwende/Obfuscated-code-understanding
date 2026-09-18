import java.util.List;
import java.util.Iterator;

public class ListUtils {
    public static List<Integer> removeOdd(List<Integer> l) {
        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 != 0) {
                it.remove();
            }
        }
        return l;
    }
}
