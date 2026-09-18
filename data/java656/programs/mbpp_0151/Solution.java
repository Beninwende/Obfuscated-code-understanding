public class CoprimeChecker {
    public static int gcd(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static boolean isCoprime(int x, int y) {
        return gcd(x, y) == 1;
    }
}
