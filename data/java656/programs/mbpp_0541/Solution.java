public class AbundantNumber {
    public static int getSum(int n) {
        int sum = 0;
        int limit = (int) Math.sqrt(n);
        for (int i = 1; i <= limit; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    sum += i;
                } else {
                    sum += i;
                    sum += n / i;
                }
            }
        }
        sum -= n;
        return sum;
    }

    public static boolean checkAbundant(int n) {
        return getSum(n) > n;
    }
}
