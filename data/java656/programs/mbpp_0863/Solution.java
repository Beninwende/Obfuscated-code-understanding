import java.util.*;

public class Solution {
    public static int findLongestConseqSubseq(int[] arr, int n) {
        int ans = 0, count = 0;
        Arrays.sort(arr);
        List<Integer> v = new ArrayList<>();
        v.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                v.add(arr[i]);
            }
        }
        for (int i = 0; i < v.size(); i++) {
            if (i > 0 && v.get(i) == v.get(i - 1) + 1) {
                count++;
            } else {
                count = 1;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
