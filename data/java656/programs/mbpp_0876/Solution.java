public class LCM {
    public static int lcm(int x, int y) {
        int z = (x > y) ? x : y;
        while (true) {
            if (z % x == 0 && z % y == 0) {
                return z;
            }
            z++;
        }
    }
}
