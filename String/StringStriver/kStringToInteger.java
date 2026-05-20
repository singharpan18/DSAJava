package String.StringStriver;
public class kStringToInteger {

    public static int myAtoi(String s) {

        int i = 0;
        int sign = 1;
        int result = 0;

        int n = s.length();

        // Step 1: Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        }

        // Step 3: Process digits
        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // Step 4: Check overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {

                return sign == 1
                        ? Integer.MAX_VALUE
                        : Integer.MIN_VALUE;
            }

            // Build number
            result = result * 10 + digit;

            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {

        String s = "   -42";

        System.out.println(myAtoi(s));
    }
}
/*
We want:
result * 10 + digit <= Integer.MAX_VALUE

Solve Mathematically
result * 10 <= MAX_VALUE - digit
Divide by 10:
result <= (MAX_VALUE - digit) / 10

If result becomes bigger than this:
if(result > (MAX_VALUE - digit) / 10)
then overflow will happen.

Time Complexity: Traverse string once: O(n)
Space Complexity: Only variables used: O(1)
*/