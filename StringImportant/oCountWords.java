package StringImportant;

public class oCountWords {

    public static int countWords1(String s) {

        // Remove extra spaces from start/end
        s = s.trim();

        // Split sentence into words
        String[] words = s.split("\\s+");

        // Return number of words
        return words.length;
    }


    public static int countWords(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // Word start detected
            if (s.charAt(i) != ' ' &&
               (i == 0 || s.charAt(i - 1) == ' ')) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "Java is powerful";

        System.out.println(countWords(s));
    }
}