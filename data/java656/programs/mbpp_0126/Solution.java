public class CommonDivisorsSum {
    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = 1; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
