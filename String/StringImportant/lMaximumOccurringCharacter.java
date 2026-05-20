package String.StringImportant;

public class lMaximumOccurringCharacter {

    public static char maxOccurring(String s) {

        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            freq[ch - 'a']++;
        }

        // Assume first character has max frequency
        char maxChar = s.charAt(0);

        // Traverse string to maintain original order
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Update max character
            if (freq[ch - 'a'] >
                    freq[maxChar - 'a']) {

                maxChar = ch;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {

        String s = "success";

        System.out.println(maxOccurring(s));
    }
}