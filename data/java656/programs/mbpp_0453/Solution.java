public class Solution {
    public static long sumofFactors(long n) {
        if (n % 2 != 0) {
            return 0;
        }
        long res = 1;
        long tempN = n;
        long limit = (long) Math.sqrt(n) + 1;
        for (long i = 2; i <= limit; i++) {
            long count = 0;
            long curr_sum = 1;
            long curr_term = 1;
            while (tempN % i == 0) {
                count++;
                tempN /= i;
                if (i == 2 && count == 1) {
                    curr_sum = 0;
                }
                curr_term *= i;
                curr_sum += curr_term;
            }
            res *= curr_sum;
        }
        if (tempN >= 2) {
            res *= (1 + tempN);
        }
        return res;
    }
}
