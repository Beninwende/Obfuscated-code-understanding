import java.util.List;
import java.util.Collections;

public class Solution {
    public static <T extends Comparable<? super T>> List<List<T>> reverseListLists(List<List<T>> lists) {
        for (List<T> l : lists) {
            Collections.sort(l, Collections.reverseOrder());
        }
        return lists;
    }
}
