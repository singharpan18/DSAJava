package StringImportant;
import java.util.LinkedHashSet;

public class hRemoveDuplicates {

    public static String removeDuplicates(String s) {

        // Stores unique characters in insertion order
        LinkedHashSet<Character> set =
                new LinkedHashSet<>();

        // Add characters to set
        for (char ch : s.toCharArray()) {

            set.add(ch);
        }

        // Build final string
        StringBuilder result = new StringBuilder();

        for (char ch : set) {

            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "programming";

        System.out.println(removeDuplicates(s));
    }
}
/*
Why LinkedHashSet?
Removes duplicates
Maintains insertion order
*/
