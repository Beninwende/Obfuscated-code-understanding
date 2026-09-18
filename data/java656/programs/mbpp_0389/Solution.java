public class LucasNumber {
    public static int findLucas(int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        return findLucas(n - 1) + findLucas(n - 2);
    }
}
