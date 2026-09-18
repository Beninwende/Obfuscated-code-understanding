import java.util.*;

public class FirstNonRepeatingCharacter {
    public static Character firstNonRepeatingCharacter(String str1) {
        List<Character> charOrder = new ArrayList<>();
        Map<Character, Integer> ctr = new HashMap<>();
        for (char c : str1.toCharArray()) {
            if (ctr.containsKey(c)) {
                ctr.put(c, ctr.get(c) + 1);
            } else {
                ctr.put(c, 1);
                charOrder.add(c);
            }
        }
        for (Character c : charOrder) {
            if (ctr.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
