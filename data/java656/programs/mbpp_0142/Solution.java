import java.util.List;

public class Solution {
    public static <T> int countSamePair(List<T> list1, List<T> list2, List<T> list3) {
        int result = 0;
        int size = Math.min(list1.size(), Math.min(list2.size(), list3.size()));
        for (int i = 0; i < size; i++) {
            T m = list1.get(i), n = list2.get(i), o = list3.get(i);
            if (m.equals(n) && n.equals(o)) {
                result++;
            }
        }
        return result;
    }
}
