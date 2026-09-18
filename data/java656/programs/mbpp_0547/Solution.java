public class Solution {
    public static int totalHammingDistance(int n) {
        int i = 1;
        int sum = 0;
        while (n / i > 0) {
            sum += n / i;
            i *= 2;
        }
        return sum;
    }
}
