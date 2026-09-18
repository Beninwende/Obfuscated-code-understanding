public class Checker {
    public static boolean checkSmaller(int[] testTup1, int[] testTup2) {
        int len = Math.min(testTup1.length, testTup2.length);
        for (int i = 0; i < len; i++) {
            if (testTup1[i] <= testTup2[i]) {
                return false;
            }
        }
        return true;
    }
}
