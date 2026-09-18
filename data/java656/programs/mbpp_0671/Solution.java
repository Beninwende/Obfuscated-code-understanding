public class BitUtils {
    public static int getPosOfRightmostSetBit(int n) {
        return Integer.numberOfTrailingZeros(n) + 1;
    }

    public static int setRightmostUnsetBit(int n) {
        if (n == 0) {
            return 1;
        }
        if ((n & (n + 1)) == 0) {
            return n;
        }
        int pos = getPosOfRightmostSetBit(~n);
        return n | (1 << (pos - 1));
    }
}
