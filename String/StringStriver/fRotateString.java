package String.StringStriver;
public class fRotateString {

    public static boolean rotateString(String s, String goal) {

        // Lengths must be same
        if (s.length() != goal.length()) {
            return false;
        }

        // Concatenate string with itself
        String doubled = s + s;

        // Check if goal exists inside doubled string
        return doubled.contains(goal);
    }

    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));
    }
} 
/*
All rotations of a string exist inside s+s.
So I concatenate the string with itself and check whether goal is present inside it.
Concatenation and contains both take linear time, so overall TC is O(n).
Extra concatenated string is created, so SC is O(n).
*/
