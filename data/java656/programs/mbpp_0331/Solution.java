public class BitUtils {
    public static int countUnsetBits(int n) {
        int count = 0;
        int x = 1;
        while (x < n + 1) {
            if ((x & n) == 0) {
                count++;
            }
            x <<= 1;
        }
        return count;
    }
}
