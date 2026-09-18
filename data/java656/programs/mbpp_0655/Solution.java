public class Main {
    public static long fifthPowerSum(int n) {
        long sm = 0;
        for (int i = 1; i <= n; i++) {
            sm += (long)i * i * i * i * i;
        }
        return sm;
    }
}
