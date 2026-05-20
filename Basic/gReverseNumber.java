package Basic;

public class gReverseNumber {

    public static int reverseNumber(int num) {

        int reverse = 0;

        while (num > 0) {

            // Get last digit
            int digit = num % 10;

            // Add digit to reverse
            reverse = reverse * 10 + digit;

            // Remove last digit
            num = num / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        int num = 1234;

        System.out.println(reverseNumber(num));
    }
}