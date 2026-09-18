public class Solution {
    public static int findEvenPair(int[] A, int N) {
        int evenPair = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (((A[i] ^ A[j]) % 2) == 0) {
                    evenPair++;
                }
            }
        }
        return evenPair;
    }
}
