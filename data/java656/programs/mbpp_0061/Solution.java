import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static long countSubstrings(String s, int n) {
        long count = 0;
        int sum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += s.charAt(i) - '0';
            int key = sum - (i + 1);
            int freq = mp.getOrDefault(key, 0);
            count += freq;
            mp.put(key, freq + 1);
        }
        return count;
    }
}
