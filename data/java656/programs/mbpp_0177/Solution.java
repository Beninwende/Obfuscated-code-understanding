public class Solution {
    public static long[] answer(long L, long R) {
        if (2 * L <= R) {
            return new long[]{L, 2 * L};
        } else {
            return new long[]{-1};
        }
    }
}
