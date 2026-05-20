package Basic;

public class bPalindromeNumber {

    public static boolean isPalindrome(int num) {

        int original = num;

        int reverse = 0;

        // Reverse number
        while (num > 0) {

            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num = num / 10;
        }

        // Compare original and reverse
        return original == reverse;
    }

    public static void main(String[] args) {

        int num = 121;

        System.out.println(isPalindrome(num));
    }
}