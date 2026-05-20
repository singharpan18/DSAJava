package Basic;

public class iCountDigits {

    public static int countDigits(int num) {

        int count = 0;

        while (num > 0) {

            count++;

            // Remove last digit
            num = num / 10;
        }

        return count;
    }

    public static void main(String[] args) {

        int num = 12345;

        System.out.println(countDigits(num));
    }
}