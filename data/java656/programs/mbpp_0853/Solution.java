public class Main {
    public static long sumOfOddFactors(long n) {
        long res = 1;
        while (n % 2 == 0) {
            n /= 2;
        }
        long limit = (long) Math.sqrt(n) + 1;
        for (long i = 3; i <= limit; i += 2) {
            long count = 0;
            long currSum = 1;
            long currTerm = 1;
            while (n % i == 0) {
                count++;
                n /= i;
                currTerm *= i;
                currSum += currTerm;
            }
            res *= currSum;
        }
        if (n >= 2) {
            res *= (1 + n);
        }
        return res;
    }
}
