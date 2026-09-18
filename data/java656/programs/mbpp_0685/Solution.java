import java.util.Arrays;

public class PrimeSum {
    public static int sumOfPrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        int p = 2;
        while (p * p <= n) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
            p++;
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                sum += i;
            }
        }
        return sum;
    }
}
