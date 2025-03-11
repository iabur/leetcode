import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> pair = new HashMap<>();
        pair.put('(', ')');
        pair.put('{', '}');
        pair.put('[', ']');
        Stack<Character> stack = new Stack<>();

        for (char currentChar : s.toCharArray()) {
            if (pair.containsKey(currentChar)) {
                stack.push(currentChar);
            } else if (stack.isEmpty() || pair.get(stack.pop()) != currentChar) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}