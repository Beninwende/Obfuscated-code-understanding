import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<String> permuteString(String str) {
        if (str.isEmpty()) {
            List<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        List<String> prevList = permuteString(str.substring(1));
        List<String> nextList = new ArrayList<>();
        char first = str.charAt(0);
        for (String s : prevList) {
            for (int j = 0; j <= s.length(); j++) {
                String newStr = s.substring(0, j) + first + s.substring(j);
                if (!nextList.contains(newStr)) {
                    nextList.add(newStr);
                }
            }
        }
        return nextList;
    }
}
