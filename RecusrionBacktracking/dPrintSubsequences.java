package RecusrionBacktracking;

public class dPrintSubsequences {

    public static void printSubsequence(String str, int index, StringBuilder current) {

        // Base case
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Not pick
        printSubsequence(str, index + 1, current);

        // Pick
        current.append(str.charAt(index));
        printSubsequence(str, index + 1, current);

        // Backtrack
        current.deleteCharAt(current.length() - 1);
    }

    public static void main(String[] args) {

        String str = "abc";

        printSubsequence(str, 0, new StringBuilder());
    }
}