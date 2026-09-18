public class RotationCounter {
    public static int findRotationCount(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            if (A[left] <= A[right]) {
                return left;
            }
            int mid = left + (right - left) / 2;
            int next = (mid + 1) % A.length;
            int prev = (mid - 1 + A.length) % A.length;
            if (A[mid] <= A[next] && A[mid] <= A[prev]) {
                return mid;
            } else if (A[mid] <= A[right]) {
                right = mid - 1;
            } else if (A[mid] >= A[left]) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
