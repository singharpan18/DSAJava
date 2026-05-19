package StringImportant;

public class iCountVowelsConsonants {

    // Function to check vowel
    public static boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' ||
               ch == 'i' || ch == 'o' ||
               ch == 'u';
    }

    public static void count(String s) {

        int vowels = 0;
        int consonants = 0;

        // Traverse string
        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            // Ignore non-alphabet characters
            if (Character.isLetter(ch)) {

                if (isVowel(ch)) {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }

    public static void main(String[] args) {

        String s = "Java";

        count(s);
    }
}