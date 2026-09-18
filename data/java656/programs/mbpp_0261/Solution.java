public class Main {
    public static int[] divisionElements(int[] testTup1, int[] testTup2) {
        int len = Math.min(testTup1.length, testTup2.length);
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = testTup1[i] / testTup2[i];
        }
        return res;
    }
}
