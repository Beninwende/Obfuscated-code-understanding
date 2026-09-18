public class BitUtils {
    public static boolean isPowerOfTwo(int x) {
        return x != 0 && (x & (x - 1)) == 0;
    }

    public static boolean differAtOneBitPos(int a, int b) {
        return isPowerOfTwo(a ^ b);
    }
}
