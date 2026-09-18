public class StringConcatenator {
    public static String[] concatenateStrings(String[] testTup1, String[] testTup2) {
        int length = Math.min(testTup1.length, testTup2.length);
        String[] res = new String[length];
        for (int i = 0; i < length; i++) {
            res[i] = testTup1[i] + testTup2[i];
        }
        return res;
    }
}
