import java.util.Arrays;

public class Solution {
    public static int findInd(int key, int i, int n, int k, int[] arr) {
        int ind = -1;
        int start = i + 1;
        int end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - key <= k) {
                ind = mid;
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return ind;
    }

    public static int removals(int[] arr, int n, int k) {
        int ans = n - 1;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int j = findInd(arr[i], i, n, k, arr);
            if (j != -1) {
                ans = Math.min(ans, n - (j - i + 1));
            }
        }
        return ans;
    }
}
