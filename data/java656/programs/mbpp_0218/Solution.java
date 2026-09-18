public class Solution {
    public static int minOperations(int A, int B) {
        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int g = gcd(A, B);
        B /= g;
        return B - 1;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
