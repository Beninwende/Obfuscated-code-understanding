public class BitUtils {
    public static int setLeftMostUnsetBit(int n) {
        if ((n & (n + 1)) == 0) {
            return n;
        }
        int pos = 0, temp = n, count = 0;
        while (temp != 0) {
            if ((temp & 1) == 0) {
                pos = count;
            }
            count++;
            temp >>= 1;
        }
        return n | (1 << pos);
    }
}
