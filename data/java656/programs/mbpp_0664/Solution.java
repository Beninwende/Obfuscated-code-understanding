public class Solution {
    public static int averageEven(int n) {
        if (n % 2 != 0) {
            return -1;
        }
        int sum = 0;
        int count = 0;
        while (n >= 2) {
            sum += n;
            count++;
            n -= 2;
        }
        return sum / count;
    }
}
