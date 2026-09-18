import java.util.Arrays;

public class PalindromeUtils {
    public static boolean isPalindrome(int n) {
        int divisor = 1;
        while (n / divisor >= 10) {
            divisor *= 10;
        }
        while (n != 0) {
            int leading = n / divisor;
            int trailing = n % 10;
            if (leading != trailing) {
                return false;
            }
            n = (n % divisor) / 10;
            divisor /= 100;
        }
        return true;
    }

    public static int largestPalindrome(int[] A, int n) {
        Arrays.sort(A);
        for (int i = n - 1; i >= 0; i--) {
            if (isPalindrome(A[i])) {
                return A[i];
            }
        }
        return -1;
    }
}
