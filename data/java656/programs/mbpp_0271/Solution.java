public class EvenPowerSum {
    public static long evenPowerSum(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            long j = 2L * i;
            sum += j * j * j * j * j;
        }
        return sum;
    }
}
