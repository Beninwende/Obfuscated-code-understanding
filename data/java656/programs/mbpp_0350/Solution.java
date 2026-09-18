public class Solution {
    public static int minimumLength(String s) {
        int n = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int maxOcc = 0;
        for (int count : arr) {
            if (count > maxOcc) {
                maxOcc = count;
            }
        }
        return n - maxOcc;
    }
}
