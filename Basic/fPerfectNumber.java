package Basic;
/*A number is Perfect if: Sum of proper divisors = number itself */
public class fPerfectNumber {

    public static boolean isPerfect(int num) {

        int sum = 0;

        // Check factors till num/2
        for (int i = 1; i <= num / 2; i++) {

            // If factor found
            if (num % i == 0) {

                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {

        int num = 28;

        if (isPerfect(num)) {

            System.out.println("Perfect Number");
        }
        else {

            System.out.println("Not Perfect Number");
        }
    }
}