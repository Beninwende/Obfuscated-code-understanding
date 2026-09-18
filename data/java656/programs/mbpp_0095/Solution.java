import java.util.List;

public class Solution {
    public static int findMinLength(List<List<?>> lst) {
        int minLength = Integer.MAX_VALUE;
        for (List<?> sublist : lst) {
            int length = sublist.size();
            if (length < minLength) {
                minLength = length;
            }
        }
        return minLength;
    }
}
