import java.util.Arrays;

public class Solution {
    public static int findSum(int[] arr, int n) {
        Arrays.sort(arr);
        int sum = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                sum += arr[i + 1];
            }
        }
        return sum;
    }
}
