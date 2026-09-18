import java.util.Arrays;

public class Solution {
    public static int findPlatform(int[] arr, int[] dep, int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platNeeded = 1, result = 1;
        int i = 1, j = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platNeeded++;
                i++;
            } else {
                platNeeded--;
                j++;
            }
            if (platNeeded > result) {
                result = platNeeded;
            }
        }
        return result;
    }
}
