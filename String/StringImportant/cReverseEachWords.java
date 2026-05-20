package String.StringImportant;

public class cReverseEachWords {

    public static String reverseEveryWord(String s) {

        // Split sentence into words
        String[] words = s.split(" ");

        // Final result
        StringBuilder result = new StringBuilder();

        // Traverse each word
        for (int i = 0; i < words.length; i++) {

            // Convert word to char array
            char[] ch = words[i].toCharArray();

            int left = 0;
            int right = ch.length - 1;

            // Reverse characters
            while (left < right) {

                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }

            // Add reversed word
            result.append(new String(ch));

            // Add space except after last word
            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "arpan singh";

        System.out.println(reverseEveryWord(s));
    }
}