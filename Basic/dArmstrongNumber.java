package Basic;
public class dArmstrongNumber {

    public static boolean isArmstrong(int num) {

        int original = num;

        int sum = 0;

        // Count digits
        int digits = String.valueOf(num).length();

        while (num > 0) {

            int digit = num % 10;

            sum += Math.pow(digit, digits);

            num = num / 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {

        int num = 153;

        System.out.println(isArmstrong(num));
    }
}
/*
Input: 123
Calculation:1^3+2^3+3^3 = 36
36 ≠ 123
So not Armstrong.
*/
