public class GCDUtil {
    public static int findGcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static int getGcd(int[] l) {
        int gcd = findGcd(l[0], l[1]);
        for (int i = 2; i < l.length; i++) {
            gcd = findGcd(gcd, l[i]);
        }
        return gcd;
    }
}
