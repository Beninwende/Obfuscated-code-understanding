import java.util.Arrays;

public class Solution {
    public static int findMinSum(int[] a, int[] b, int n) {
        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(a[i] - b[i]);
        }
        return sum;
    }
}
