public class Rencontres {
    public static long binomialCoeff(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }

    public static long rencontresNumber(int n, int m) {
        if (n == 0 && m == 0) {
            return 1;
        }
        if (n == 1 && m == 0) {
            return 0;
        }
        if (m == 0) {
            return (n - 1) * (rencontresNumber(n - 1, 0) + rencontresNumber(n - 2, 0));
        }
        return binomialCoeff(n, m) * rencontresNumber(n - m, 0);
    }
}
