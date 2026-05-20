package String.StringStriver;
public class hMaximumNestingDepth {

    public static int maxDepth(String s) {

        int depth = 0;
        int maxDepth = 0;

        for (char ch : s.toCharArray()) {

            // Opening bracket increases depth
            if (ch == '(') {
                depth++;

                // Update maximum depth
                maxDepth = Math.max(maxDepth, depth);
            }

            // Closing bracket decreases depth
            else if (ch == ')') {
                depth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {

        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println(maxDepth(s));
    }
}
/*
TC: O(n)
SC: O(1)
*/