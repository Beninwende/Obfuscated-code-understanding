import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static List<Integer> sortNumericStrings(List<String> numsStr) {
        List<Integer> result = new ArrayList<>();
        for (String s : numsStr) {
            result.add(Integer.parseInt(s));
        }
        Collections.sort(result);
        return result;
    }
}
