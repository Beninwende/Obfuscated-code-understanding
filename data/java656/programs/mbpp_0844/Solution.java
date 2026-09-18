public class Solution {
    public static int getNumber(int n, int k) {
        int[] arr = new int[n];
        int i = 0;
        int odd = 1;
        while (odd <= n) {
            arr[i] = odd;
            i++;
            odd += 2;
        }
        int even = 2;
        while (even <= n) {
            arr[i] = even;
            i++;
            even += 2;
        }
        return arr[k - 1];
    }
}
