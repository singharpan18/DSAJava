package Basic;

public class aFibonacciSeries {

    public static void printFibonacci(int n) {

        int first = 0;
        int second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 2; i < n; i++) {

            int next = first + second;

            System.out.print(next + " ");

            // Update variables
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        int n = 7;

        printFibonacci(n);
    }
}