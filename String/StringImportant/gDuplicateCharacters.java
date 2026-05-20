package String.StringImportant;

public class gDuplicateCharacters {

    public static void findDuplicates(String s) {

        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            freq[ch - 'a']++;
        }

        // Print duplicates
        for (int i = 0; i < 26; i++) {

            if (freq[i] > 1) {

                // Convert index back to character
                char ch = (char)(i + 'a');

                System.out.print(ch + " ");
            }
        }
    }

    public static void main(String[] args) {

        String s = "programming";

        findDuplicates(s);
    }
}