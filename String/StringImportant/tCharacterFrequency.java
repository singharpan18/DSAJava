package String.StringImportant;

public class tCharacterFrequency {

    public static void main(String[] args) {

        String s = "apple";

        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            freq[ch - 'a']++;
        }

        // Print frequencies
        for (int i = 0; i < 26; i++) {

            if (freq[i] > 0) {

                char ch = (char)(i + 'a');

                System.out.println(ch +
                        " -> " + freq[i]);
            }
        }
    }
}