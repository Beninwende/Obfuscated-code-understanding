public class Solution {
    public static boolean checkGreater(int[] testArr1, int[] testArr2) {
        int length = Math.min(testArr1.length, testArr2.length);
        for (int i = 0; i < length; i++) {
            if (testArr1[i] >= testArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
