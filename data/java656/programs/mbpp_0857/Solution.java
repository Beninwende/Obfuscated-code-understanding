import java.util.*;
import java.util.stream.*;

public class Solution {
    public static List<List<Character>> listifyList(List<String> list1) {
        return list1.stream()
            .map(s -> {
                List<Character> chars = new ArrayList<>();
                for (char c : s.toCharArray()) {
                    chars.add(c);
                }
                return chars;
            })
            .collect(Collectors.toList());
    }
}
