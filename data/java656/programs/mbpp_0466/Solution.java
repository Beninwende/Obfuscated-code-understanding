public class Solution {
    public static int findPeakUtil(int[] arr, int low, int high, int n) {
        int mid = low + (high - low) / 2;
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) &&
            (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
            return mid;
        } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return findPeakUtil(arr, low, mid - 1, n);
        } else {
            return findPeakUtil(arr, mid + 1, high, n);
        }
    }

    public static int findPeak(int[] arr, int n) {
        return findPeakUtil(arr, 0, n - 1, n);
    }
}
