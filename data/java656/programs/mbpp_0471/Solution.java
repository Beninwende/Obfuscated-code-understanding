public class Solution {
    public static int findRemainder(int[] arr, int len, int n) {
        long mul = 1;
        for (int i = 0; i < len; i++) {
            mul = (mul * (arr[i] % n)) % n;
        }
        return (int)(mul % n);
    }
}
