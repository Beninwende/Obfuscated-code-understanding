public class CommonDivisors {
    public static int ngcd(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int numCommDiv(int x, int y) {
        int n = ngcd(x, y);
        int result = 0;
        int z = (int) Math.sqrt(n);
        for (int i = 1; i <= z; i++) {
            if (n % i == 0) {
                result += 2;
                if (i == n / i) {
                    result--;
                }
            }
        }
        return result;
    }
}
