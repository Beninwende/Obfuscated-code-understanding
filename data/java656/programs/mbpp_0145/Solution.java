public class MaxAbsDiff {
    public static int maxAbsDiff(int[] arr, int n) {
        int minEle = arr[0];
        int maxEle = arr[0];
        for (int i = 1; i < n; i++) {
            minEle = Math.min(minEle, arr[i]);
            maxEle = Math.max(maxEle, arr[i]);
        }
        return maxEle - minEle;
    }
}
