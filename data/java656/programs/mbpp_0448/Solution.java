public class PerrinSum {
    public static long calSum(int n) {
        long a = 3;
        long b = 0;
        long c = 2;
        if (n == 0) {
            return 3;
        }
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 5;
        }
        long sum = 5;
        while (n > 2) {
            long d = a + b;
            sum += d;
            a = b;
            b = c;
            c = d;
            n--;
        }
        return sum;
    }
}
