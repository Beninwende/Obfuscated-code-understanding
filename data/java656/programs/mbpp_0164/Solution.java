public class DivisorUtils {
    public static int divSum(int n) {
        int sum = 1;
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                sum = sum + i + n / i;
            }
            i++;
        }
        return sum;
    }

    public static boolean areEquivalent(int num1, int num2) {
        return divSum(num1) == divSum(num2);
    }
}
