package String.StringImportant;

public class jStringCompress {

    public static String compress(String s) {

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 1; i < s.length(); i++) {

            // Same as previous character
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
            else {
                // Add previous character and its count
                result.append(s.charAt(i - 1));
                result.append(count);

                // Reset count for new character
                count = 1;
            }
        }

        // Add last character and its count
        result.append(s.charAt(s.length() - 1));
        result.append(count);

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "aaabbcc";

        System.out.println(compress(s));
    }  
}
/*
Problem: Loop ends here:
i = 6
But:
c2
has NOT been added yet.
Because append happens only when character changes.
For last group:
no next different character comes
so it never enters else block
That is Why
After loop we manually add:
result.append(s.charAt(s.length() - 1));
result.append(count);
*/
