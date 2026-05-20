package String.StringStriver;
public class gRemoveOuterParentheses {

    public static String removeOuterParentheses(String s) {

        // Stores final answer
        StringBuilder result = new StringBuilder();

        // Tracks current nesting depth
        int depth = 0;

        // Traverse string
        for (char ch : s.toCharArray()) {

            // Opening bracket
            if (ch == '(') {

                // If already inside, add it
                if (depth > 0) {
                    result.append(ch);
                }

                // Increase depth
                depth++;
            }

            // Closing bracket
            else {

                // Decrease depth first
                depth--;

                // If still inside, add it
                if (depth > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "(()())(())";

        System.out.println(removeOuterParentheses(s));
    }
}
/*
Time Complexity: O(n)
Because we traverse the string only once.
Space Complexity: O(n)
Because we use StringBuilder result to store the final answer.
*/