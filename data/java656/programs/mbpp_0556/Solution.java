public class Solution {
    public static int findOddPair(int[] A, int N) {
        int oddPair = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (((A[i] ^ A[j]) % 2) != 0) {
                    oddPair++;
                }
            }
        }
        return oddPair;
    }
}
