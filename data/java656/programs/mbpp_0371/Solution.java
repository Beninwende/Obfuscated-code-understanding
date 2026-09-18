public class SmallestMissing {
    public static int smallestMissing(int[] A, int left, int right) {
        if (left > right) {
            return left;
        }
        int mid = left + (right - left) / 2;
        if (A[mid] == mid) {
            return smallestMissing(A, mid + 1, right);
        } else {
            return smallestMissing(A, left, mid - 1);
        }
    }
}
