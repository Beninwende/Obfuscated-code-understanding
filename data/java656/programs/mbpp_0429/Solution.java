public class TupleUtils {
    public static int[] andTuples(int[] testTup1, int[] testTup2) {
        int length = Math.min(testTup1.length, testTup2.length);
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = testTup1[i] & testTup2[i];
        }
        return res;
    }
}
