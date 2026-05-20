package Basic;

public class hSumOfDigits {

    public static int sumOfDigits(int num) {

        int sum = 0;

        while (num > 0) {

            // Get last digit
            int digit = num % 10;

            sum += digit;

            // Remove last digit
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int num = 123;

        System.out.println(sumOfDigits(num));
    }
}