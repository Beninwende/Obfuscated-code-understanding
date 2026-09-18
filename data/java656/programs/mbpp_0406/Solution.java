public class ParityFinder {
    public static String findParity(int x) {
        int y = x ^ (x >> 1);
        y ^= (y >> 2);
        y ^= (y >> 4);
        y ^= (y >> 8);
        y ^= (y >> 16);
        if ((y & 1) == 1) {
            return "Odd Parity";
        }
        return "Even Parity";
    }
}
