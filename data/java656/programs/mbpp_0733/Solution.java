public class Solution {
    public static int findFirstOccurrence(int[] A, int x) {
        int left = 0;
        int right = A.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (x == A[mid]) {
                result = mid;
                right = mid - 1;
            } else if (x < A[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
