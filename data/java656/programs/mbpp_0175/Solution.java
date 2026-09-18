import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public boolean isValidParentheses(String str1) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> pchar = new HashMap<>();
        pchar.put('(', ')');
        pchar.put('{', '}');
        pchar.put('[', ']');
        for (char ch : str1.toCharArray()) {
            if (pchar.containsKey(ch)) {
                stack.push(ch);
            } else if (stack.isEmpty() || pchar.get(stack.pop()) != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
