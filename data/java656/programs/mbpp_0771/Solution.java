import java.util.Stack;

public class ExpressionChecker {
    public static boolean checkExpression(String exp) {
        if (exp.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : exp.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((top == '(' && ch != ')') ||
                    (top == '{' && ch != '}') ||
                    (top == '[' && ch != ']')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
