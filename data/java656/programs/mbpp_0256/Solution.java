public class PrimeCounter {
    public static int countPrimesNums(int n) {
        int ctr = 0;
        for (int num = 0; num < n; num++) {
            if (num <= 1) {
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                ctr++;
            }
        }
        return ctr;
    }
}
