public class BitUtils {
    public static int countUnsetBits(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 2 == 0) {
                    cnt++;
                }
                temp /= 2;
            }
        }
        return cnt;
    }
}
