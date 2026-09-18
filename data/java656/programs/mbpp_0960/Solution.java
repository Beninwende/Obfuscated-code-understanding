public class Tiling {
    public static int getNoOfWays(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return getNoOfWays(n - 1) + getNoOfWays(n - 2);
    }
}
