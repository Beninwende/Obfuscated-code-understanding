import java.util.Arrays;

public class MinDiffFinder {
    public static int findMinDiff(int[] arr) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            diff = Math.min(diff, arr[i + 1] - arr[i]);
        }
        return diff;
    }
}
