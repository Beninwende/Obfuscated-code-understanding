public class Solution {
    public static boolean productEqual(int n) {
        if (n < 10) {
            return false;
        }
        int prodOdd = 1;
        int prodEven = 1;
        while (n > 0) {
            int digit = n % 10;
            prodOdd *= digit;
            n /= 10;
            if (n == 0) {
                break;
            }
            digit = n % 10;
            prodEven *= digit;
            n /= 10;
        }
        return prodOdd == prodEven;
    }
}
