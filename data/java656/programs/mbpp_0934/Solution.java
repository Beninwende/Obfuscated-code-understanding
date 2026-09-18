public class Delannoy {
    public static int dealnnoyNum(int n, int m) {
        if (n == 0 || m == 0) {
            return 1;
        }
        return dealnnoyNum(m - 1, n) + dealnnoyNum(m - 1, n - 1) + dealnnoyNum(m, n - 1);
    }
}
