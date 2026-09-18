public class EvenPowerSum {
    public static long evenPowerSum(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            int j = 2 * i;
            sum += (long) j * j * j * j;
        }
        return sum;
    }
}
