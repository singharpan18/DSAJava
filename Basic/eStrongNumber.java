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

/*A number is Strong if: Sum of factorials of digits = original number
Example: 145
Digits of 145 are:
1
4
5

Now find factorial of each digit:
1! = 1
4! = 4 × 3 × 2 × 1 = 24
5! = 5 × 4 × 3 × 2 × 1 = 120

Now add them:
1 + 24 + 120 = 145

Since the sum is equal to the original number:
145 = 145

So, 145 is a Strong Number ✅
*/