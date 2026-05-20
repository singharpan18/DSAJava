package String.StringImportant;

public class ddCheckPalindromeWidTwist {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Ignore non-alphanumeric from left
            while (left < right &&
                    !Character.isLetterOrDigit(s.charAt(left))) {

                left++;
            }

            // Ignore non-alphanumeric from right
            while (left < right &&
                    !Character.isLetterOrDigit(s.charAt(right))) {

                right--;
            }

            // Convert both to lowercase and compare
            char ch1 = Character.toLowerCase(s.charAt(left));
            char ch2 = Character.toLowerCase(s.charAt(right));

            // If mismatch
            if (ch1 != ch2) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}
/*
✅ Ignore spaces
✅ Ignore special characters
✅ Ignore uppercase/lowercase

Example:

"A man, a plan, a canal: Panama"

Output:

true

Because after ignoring spaces/special characters:

amanaplanacanalpanama

which is palindrome.
*/