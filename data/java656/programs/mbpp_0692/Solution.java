public class Solution {
    public static Integer lastTwoDigits(int N) {
        if (N >= 10) {
            return null;
        }
        int fac = 1;
        for (int i = 1; i <= N; i++) {
            fac = (fac * i) % 100;
        }
        return fac;
    }
}
