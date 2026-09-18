public class Solution {
    public static long sumDigitsSingle(long x) {
        long ans = 0;
        while (x > 0) {
            ans += x % 10;
            x /= 10;
        }
        return ans;
    }

    public static long closest(long x) {
        long ans = 0;
        while (ans * 10 + 9 <= x) {
            ans = ans * 10 + 9;
        }
        return ans;
    }

    public static long sumDigitsTwoParts(long N) {
        long A = closest(N);
        return sumDigitsSingle(A) + sumDigitsSingle(N - A);
    }
}
