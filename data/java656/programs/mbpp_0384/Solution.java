public class Solution {
    public static int frequencyOfSmallest(int n, int[] arr) {
        int mn = arr[0];
        int freq = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] < mn) {
                mn = arr[i];
                freq = 1;
            } else if (arr[i] == mn) {
                freq++;
            }
        }
        return freq;
    }
}
