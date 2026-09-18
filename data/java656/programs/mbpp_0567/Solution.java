import java.util.List;

public class SortUtils {
    public static <T extends Comparable<? super T>> boolean isSortedList(List<T> list1) {
        for (int i = 0; i < list1.size() - 1; i++) {
            if (list1.get(i).compareTo(list1.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}
