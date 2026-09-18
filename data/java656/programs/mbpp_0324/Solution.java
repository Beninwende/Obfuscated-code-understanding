public class AlternateSum {
    public static int[] sumOfAlternates(int[] testTuple) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < testTuple.length; i++) {
            if (i % 2 == 1) {
                sum1 += testTuple[i];
            } else {
                sum2 += testTuple[i];
            }
        }
        return new int[]{sum1, sum2};
    }
}
