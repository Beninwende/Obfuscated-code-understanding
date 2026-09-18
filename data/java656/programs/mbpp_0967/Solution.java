import java.util.Set;
import java.util.HashSet;

public class VowelChecker {
    public static String check(String str) {
        Set<Character> found = new HashSet<>();
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) >= 0) {
                found.add(Character.toLowerCase(c));
            }
        }
        if (found.size() >= 5) {
            return "accepted";
        } else {
            return "not accepted";
        }
    }
}
