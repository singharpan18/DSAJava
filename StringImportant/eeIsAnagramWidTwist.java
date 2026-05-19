package StringImportant;

public class eeIsAnagramWidTwist {
    public static boolean isAnagram(String s1, String s2) {

        // Length check
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        // Count first string
        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            freq[ch - 'a']++;
        }

        // Reduce using second string
        for (int i = 0; i < s2.length(); i++) {

            char ch = s2.charAt(i);

            freq[ch - 'a']--;

            // Extra character found
            if (freq[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        System.out.println(isAnagram(s1, s2));
    }
    
}
