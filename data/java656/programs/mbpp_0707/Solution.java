public class CountSetBits {
    public static long countSetBits(long n) {
        n = n + 1;
        long powerOf2 = 2;
        long cnt = n / 2;
        while (powerOf2 <= n) {
            long totalPairs = n / powerOf2;
            cnt += (totalPairs / 2) * powerOf2;
            if ((totalPairs & 1) == 1) {
                cnt += (n % powerOf2);
            }
            powerOf2 <<= 1;
        }
        return cnt;
    }
}
