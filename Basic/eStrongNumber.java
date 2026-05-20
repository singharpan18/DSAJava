package Basic;

public class eStrongNumber {

    // Function to calculate factorial
    public static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact *= i;
        }

        return fact;
    }

    public static boolean isStrong(int num) {

        int original = num;

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum += factorial(digit);

            num = num / 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {

        int num = 145;

        System.out.println(isStrong(num));
    }
}

/*A number is Strong if: Sum of factorials of digits = original number*/