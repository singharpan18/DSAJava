package String.StringStriver;
//no need currently of doing this
public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            // Case 1: odd length palindrome
            int len1 = expandFromCenter(s, i, i);

            // Case 2: even length palindrome
            int len2 = expandFromCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            // If we found longer palindrome
            if (len > maxLength) {

                maxLength = len;

                // Calculate starting index
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLength);
    }

    private static int expandFromCenter(String s, int left, int right) {

        // Expand while characters are same
        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        // Length of palindrome
        return right - left - 1;
    }

    public static void main(String[] args) {

        String s = "babad";

        System.out.println(longestPalindrome(s));
    }
}