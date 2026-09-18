import java.util.HashSet;

public class Solution {
    public static boolean isSubset(int[] arr1, int m, int[] arr2, int n) {
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < m; i++) {
            hashset.add(arr1[i]);
        }
        for (int i = 0; i < n; i++) {
            if (!hashset.contains(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
