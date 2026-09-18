public class ToggleBits {
    public static int takeLAndFSetBits(int n) {
        n = n | (n >> 1);
        n = n | (n >> 2);
        n = n | (n >> 4);
        n = n | (n >> 8);
        n = n | (n >> 16);
        return ((n + 1) >> 1) + 1;
    }

    public static int toggleFAndLBits(int n) {
        if (n == 1) {
            return 0;
        }
        return n ^ takeLAndFSetBits(n);
    }
}
