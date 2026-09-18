public class Solution {
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean hasOne = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                hasOne = true;
                break;
            }
        }
        if (!hasOne) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            int index = (arr[i] - 1) % n;
            arr[index] += n;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
