public class OddNumSum {
    public static long oddNumSum(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            long j = 2L * i - 1;
            sum += j * j * j * j;
        }
        return sum;
    }
}
