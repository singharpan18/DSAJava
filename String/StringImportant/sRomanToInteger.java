package String.StringImportant;
import java.util.HashMap;

public class sRomanToInteger {

    public static int romanToInt(String s) {

        // Store Roman symbol values
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        // Traverse string
        for (int i = 0; i < s.length(); i++) {

            int current = map.get(s.charAt(i));

            // Check next character exists
            if (i + 1 < s.length()) {

                int next = map.get(s.charAt(i + 1));

                // Smaller before larger -> subtract
                if (current < next) {
                    result -= current;
                }
                else {
                    result += current;
                }
            }
            else {
                // Last character always add
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "MCMIV";

        System.out.println(romanToInt(s));
    }
}
/*
Normally:
VI = 5 + 1 = 6
But if smaller value comes before larger value:
IV = 5 - 1 = 4

Traverse from left to right.
If current value < next value:
subtract current
Else:
add current

Time Complexity: Traverse once: O(n)
Space Complexity: HashMap stores fixed Roman symbols: O(1): constant space.

*/