package String.StringImportant;

import java.util.HashSet;

public class qLongestSubstringWithoutRepeat {

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        // right expands the window
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // If duplicate found, shrink from left
            while (set.contains(ch)) {

                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(ch);

            // Update maximum window size
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
}
/*Why while(set.contains(ch))?

Because if current character already exists in window, we remove characters from left until duplicate is removed.

Example at index 3:

abc + a

a already exists.

Remove from left:

abc -> bc

Now add a:

bca

No duplicate.

TC and SC
Complexity	Value
TC	O(n)
SC	O(n)

Interview line:

“I used sliding window. Right pointer expands the window, and whenever duplicate appears, left pointer shrinks the 
window until all characters are unique.”*/