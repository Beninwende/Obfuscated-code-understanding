public class Solution {
    public static long countWithOddSetBits(long n) {
        if (n % 2 != 0) {
            return (n + 1) / 2;
        }
        long count = Long.bitCount(n);
        long ans = n / 2;
        if (count % 2 != 0) {
            ans++;
        }
        return ans;
    }
}
