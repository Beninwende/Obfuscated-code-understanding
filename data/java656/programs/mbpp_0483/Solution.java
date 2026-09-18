public class Solution {
    public static int firstFactorialDivisibleNumber(int x) {
        int i = 1;
        long fact = 1;
        for (i = 1; i < x; i++) {
            fact *= i;
            if (fact % x == 0) {
                break;
            }
        }
        return i;
    }
}
