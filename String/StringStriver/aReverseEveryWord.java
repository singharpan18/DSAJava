package String.StringStriver;
/*
Reverse every word in a string.
s = "arpan singh"
"napra hgnis"
*/
public class aReverseEveryWord {

    public static String reverseEveryWord(String s) {

        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        // Traverse each character of the string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // If character is not space, add it to current word
            if (ch != ' ') {
                word.append(ch);
            } 
            else {
                // Reverse the current word and add to result
                result.append(word.reverse());

                // Add space after the word
                result.append(" ");

                // Clear word for next word
                word.setLength(0);
            }
        }

        // Reverse and add the last word
        result.append(word.reverse());

        return result.toString(); //result is an object of StringBuilder.
    }

    public static void main(String[] args) {

        String s = "arpan singh";

        System.out.println(reverseEveryWord(s));
    }
}

/*
Yes, you can use String instead of StringBuilder, but it becomes inefficient because String is immutable in Java.
Every time you do:
result = result + ch;
Java creates a new object in memory.
That is why for string modification operations like:
reverse
append
insert
delete
we mostly use StringBuilder.
Time Complexity: O(n), Space Complexity: O(n) -> Big O of n
*/