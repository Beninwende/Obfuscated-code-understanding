import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static <T> List<T> extractSingly(List<List<T>> testList) {
        List<T> res = new ArrayList<>();
        Set<T> temp = new HashSet<>();
        for (List<T> inner : testList) {
            for (T ele : inner) {
                if (!temp.contains(ele)) {
                    temp.add(ele);
                    res.add(ele);
                }
            }
        }
        return res;
    }
}
