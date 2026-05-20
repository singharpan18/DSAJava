package Basic;

public class cPrimeNumber {

    public static boolean isPrime(int n) {

        // 0 and 1 are not prime
        if (n <= 1) {
            return false;
        }

        // Check till sqrt(n)
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 7;

        if (isPrime(n)) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}