public class WoodallChecker {
    public static boolean isWoodall(long x) {
        if (x % 2 == 0) {
            return false;
        }
        if (x == 1) {
            return true;
        }
        x = x + 1;
        long p = 0;
        while (x % 2 == 0) {
            x = x / 2;
            p++;
            if (p == x) {
                return true;
            }
        }
        return false;
    }
}
