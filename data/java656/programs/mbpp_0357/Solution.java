import java.util.List;

public class Solution {
    public static int findMax(List<List<String>> testList) {
        int res = Integer.MIN_VALUE;
        for (List<String> tuple : testList) {
            for (String j : tuple) {
                int val = Integer.parseInt(j);
                if (val > res) {
                    res = val;
                }
            }
        }
        return res;
    }
}
