package StringImportant;
import java.util.Stack;

public class rValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        // Traverse string
        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);
            }

            // Closing brackets
            else {

                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    return false;
                }
            }
        }

        // Stack should be empty finally
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "()[]{}";

        System.out.println(isValid(s));
    }
}