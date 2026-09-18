public class MaxProductFinder {
    public static int[] maxProduct(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }
        int x = arr[0];
        int y = arr[1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((long)arr[i] * arr[j] > (long)x * y) {
                    x = arr[i];
                    y = arr[j];
                }
            }
        }
        return new int[]{x, y};
    }
}
