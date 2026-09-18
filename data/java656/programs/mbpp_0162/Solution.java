public class SeriesSum {
    public static int sumSeries(int n) {
        if (n < 1) {
            return 0;
        } else {
            return n + sumSeries(n - 2);
        }
    }
}
