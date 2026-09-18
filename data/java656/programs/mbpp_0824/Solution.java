import java.util.List;
import java.util.Iterator;

public class RemoveEven {
    public static List<Integer> removeEven(List<Integer> l) {
        Iterator<Integer> iterator = l.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
        }
        return l;
    }
}
