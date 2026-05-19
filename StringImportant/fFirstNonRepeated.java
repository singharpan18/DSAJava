package StringImportant;

public class fFirstNonRepeated {

    public static char firstNonRepeated(String s) {

        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            freq[ch - 'a']++;
        }

        // Find first character with freq 1
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (freq[ch - 'a'] == 1) {
                return ch;
            }
        }

        return '#';
    }

    public static void main(String[] args) {

        String s = "aabbcdde";

        System.out.println(firstNonRepeated(s));
    }
}
