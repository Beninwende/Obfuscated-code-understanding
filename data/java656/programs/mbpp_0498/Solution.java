public class GCD {
    public static int gcd(int x, int y) {
        int gcd = 1;
        if (x % y == 0) {
            return y;
        }
        for (int k = y / 2; k > 0; k--) {
            if (x % k == 0 && y % k == 0) {
                gcd = k;
                break;
            }
        }
        return gcd;
    }
}
