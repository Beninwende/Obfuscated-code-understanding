public class RotationCounter {
    public static int countRotation(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return i;
            }
        }
        return 0;
    }
}
