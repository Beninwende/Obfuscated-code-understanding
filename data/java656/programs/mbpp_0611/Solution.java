import java.util.List;

public class Solution {
    public static <T extends Comparable<? super T>> T maxOfNth(List<List<T>> testList, int N) {
        T res = testList.get(0).get(N);
        for (List<T> sub : testList) {
            T val = sub.get(N);
            if (val.compareTo(res) > 0) {
                res = val;
            }
        }
        return res;
    }
}
