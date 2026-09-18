public class GCD {
    public static int recurGcd(int a, int b) {
        int low = Math.min(a, b);
        int high = Math.max(a, b);
        if (low == 0) {
            return high;
        } else if (low == 1) {
            return 1;
        } else {
            return recurGcd(low, high % low);
        }
    }
}
