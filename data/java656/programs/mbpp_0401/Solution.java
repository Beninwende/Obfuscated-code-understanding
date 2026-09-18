public class TupleAdder {
    public static int[][] addNestedTuples(int[][] testTup1, int[][] testTup2) {
        int[][] res = new int[testTup1.length][];
        for (int i = 0; i < testTup1.length; i++) {
            res[i] = new int[testTup1[i].length];
            for (int j = 0; j < testTup1[i].length; j++) {
                res[i][j] = testTup1[i][j] + testTup2[i][j];
            }
        }
        return res;
    }
}
