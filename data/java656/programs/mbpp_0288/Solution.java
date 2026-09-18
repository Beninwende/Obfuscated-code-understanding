public class Solution {
    public static int modularInverse(int[] arr, int N, int P) {
        int currentElement = 0;
        for (int i = 0; i < N; i++) {
            if ((arr[i] * arr[i]) % P == 1) {
                currentElement++;
            }
        }
        return currentElement;
    }
}
