package BitManipulation;
//Input: 13 → Binary: 1101 → Count of 1s: 3 → Output: 3
public class aCountSetBits {

    public static int countSetBits(int num) {

        int count = 0;

        while (num > 0) {

            // Check last bit
            if ((num & 1) == 1) {

                count++;
            }

            // Right shift
            num = num >> 1;
        }

        return count;
    }

    public static void main(String[] args) {

        int num = 13;

        System.out.println(countSetBits(num));
    }
}
/*
Why num & 1 Works?

Example:
13 = 1101
1  = 0001
Bitwise AND:
1101&0001=0001
Result:
1

Meaning:
last bit is set.
Right Shift
num = num >> 1;
removes last bit.
Example:
1101>>1=110
*/