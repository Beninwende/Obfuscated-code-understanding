import java.util.*;

public class Solution {
    public static <T> List<T> findDissimilar(T[] arr1, T[] arr2) {
        Set<T> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<T> set2 = new HashSet<>(Arrays.asList(arr2));
        Set<T> resultSet = new HashSet<>(set1);
        for (T item : set2) {
            if (!resultSet.add(item)) {
                resultSet.remove(item);
            }
        }
        return new ArrayList<>(resultSet);
    }
}
