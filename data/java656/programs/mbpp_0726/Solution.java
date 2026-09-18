public class MultiplyAdjacent {
    public static int[] multiplyElements(int[] testArr) {
        int n = testArr.length;
        if (n < 2) {
            return new int[0];
        }
        int[] res = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            res[i] = testArr[i] * testArr[i + 1];
        }
        return res;
    }
}
