package BitManipulation;

public class bMissingNumberXOR {

    public static int findMissing(int[] arr, int N) {

        int xor1 = 0;
        int xor2 = 0;

        // XOR from 1 to N
        for (int i = 1; i <= N; i++) {
            xor1 ^= i;
        }

        // XOR of array elements
        for (int num : arr) {
            xor2 ^= num;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int N = 5;

        System.out.println(findMissing(arr, N));
    }
}
/*
Example
arr = [1,2,4,5]
N = 5
XOR of 1 to N
1 ^ 2 ^ 3 ^ 4 ^ 5
XOR of array
1 ^ 2 ^ 4 ^ 5
Final XOR
(1 ^ 2 ^ 3 ^ 4 ^ 5)
^
(1 ^ 2 ^ 4 ^ 5)

Cancel same numbers:

1 ^ 1 = 0
2 ^ 2 = 0
4 ^ 4 = 0
5 ^ 5 = 0

Remaining:

3

Answer = 3
*/