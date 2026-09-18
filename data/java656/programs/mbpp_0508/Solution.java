import java.util.*;

public class CommonOrder {
    public static <T> boolean sameOrder(List<T> l1, List<T> l2) {
        Set<T> commonElements = new HashSet<>(l1);
        commonElements.retainAll(l2);
        List<T> filtered1 = new ArrayList<>();
        for (T e : l1) {
            if (commonElements.contains(e)) {
                filtered1.add(e);
            }
        }
        List<T> filtered2 = new ArrayList<>();
        for (T e : l2) {
            if (commonElements.contains(e)) {
                filtered2.add(e);
            }
        }
        return filtered1.equals(filtered2);
    }
}
