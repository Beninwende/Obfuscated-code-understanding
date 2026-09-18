import java.util.Arrays;

public class Solution {
    public static boolean areEqual(int[] arr1, int[] arr2, int n, int m) {
        if (n != m) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < n - 1; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
