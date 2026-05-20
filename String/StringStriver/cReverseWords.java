package String.StringStriver;
public class cReverseWords {

    public static String reverseWords(String s) {

        // Remove starting and ending spaces
        s = s.trim();

        // Split string by one or more spaces
        String[] words = s.split("\\s+");

        // StringBuilder for final answer
        StringBuilder result = new StringBuilder();

        // Traverse from last word to first
        for (int i = words.length - 1; i >= 0; i--) {

            result.append(words[i]);

            // Add space except after last word
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "  i   love   java  ";

        System.out.println(reverseWords(s));
    }
}

/*trim(), split(), and traversal each take O(n) time, so overall time complexity is O(n).
Extra space is used for split array and StringBuilder, so space complexity is O(n). */