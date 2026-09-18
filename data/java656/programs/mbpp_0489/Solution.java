public class Solution {
    public static int frequencyOfLargest(int n, int[] arr) {
        int max = arr[0];
        int freq = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                freq = 1;
            } else if (arr[i] == max) {
                freq++;
            }
        }
        return freq;
    }
}
