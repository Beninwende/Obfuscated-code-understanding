public class Solution {
    public static boolean sameLength(int A, int B) {
        while (A > 0 && B > 0) {
            A /= 10;
            B /= 10;
        }
        return A == 0 && B == 0;
    }
}
