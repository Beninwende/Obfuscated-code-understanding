public class Solution {
    public static double findAverageOfCube(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }
        double avg = sum / n;
        return Math.round(avg * 1e6) / 1e6;
    }
}
