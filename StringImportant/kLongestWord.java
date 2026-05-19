package StringImportant;

public class kLongestWord {

    public static String longestWord(String s){
        // Split sentence into words
        String[] words = s.split(" ");

        // Assume first word is longest
        String longest = words[0];

        // Traverse words
        for (String word : words) {

            // Update longest word
            if (word.length() > longest.length()) {

                longest = word;
            }
        }

        return longest;
    }
    
     public static void main(String[] args) {

        String s = "Java streams are powerful";

        System.out.println(longestWord(s));
    }
   
}
