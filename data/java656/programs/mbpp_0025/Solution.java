import java.util.Arrays;

public class Solution {
    public static int findProduct(int[] arr, int n) {
        Arrays.sort(arr);
        int prod = 1;
        for (int i = 0; i < n; i++) {
            int prev = (i == 0) ? arr[n - 1] : arr[i - 1];
            if (prev != arr[i]) {
                prod *= arr[i];
            }
        }
        return prod;
    }
}
