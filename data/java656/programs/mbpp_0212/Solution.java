public class FourthPowerSum {
    public static long fourthPowerSum(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i * i * i;
        }
        return sum;
    }
}
