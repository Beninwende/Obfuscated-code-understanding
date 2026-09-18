import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static char firstRepeatedChar(String str) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (seen.contains(ch)) {
                return ch;
            } else {
                seen.add(ch);
            }
        }
        return '\0';
    }
}
