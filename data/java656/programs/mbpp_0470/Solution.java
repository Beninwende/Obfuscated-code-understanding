public class Solution {
    public static int[] addPairwise(int[] testTup) {
        int n = testTup.length;
        int[] res = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            res[i] = testTup[i] + testTup[i + 1];
        }
        return res;
    }
}
