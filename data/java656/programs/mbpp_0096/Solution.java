public class Divisor {
    public static int divisor(int n) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    count++;
                }
            }
            x = count;
        }
        return x;
    }
}
