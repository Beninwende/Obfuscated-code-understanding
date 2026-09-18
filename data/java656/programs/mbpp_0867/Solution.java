public class Solution {
    public static int minNum(int[] arr, int n) {
        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        if (odd % 2 != 0) {
            return 1;
        }
        return 2;
    }
}
