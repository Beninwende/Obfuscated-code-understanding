import java.util.List;

public class Solution {
    public static int lenLog(List<String> list1) {
        int max = list1.get(0).length();
        for (String s : list1) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }
}
