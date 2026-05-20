package Array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayBasics {

    public static void main(String[] args) {

        /*
        Array Important Basics for DSA

        Array:
        - Mutable
        - Fixed size
        - Stores same type of elements

        IMPORTANT:
        Array length -> arr.length
        String length -> s.length()

        Common Patterns:
        - Traversal
        - Reverse
        - Two Pointer
        - Sliding Window
        - Prefix Sum
        */

        // 1. Array Declaration
        int[] arr1 = {1, 2, 3, 4, 5};

        // 2. Access Elements
        System.out.println("2. First Element: " + arr1[0]);

        // 3. Array Length
        System.out.println("3. Array Length: " + arr1.length);

        // 4. Traverse Array

        System.out.println("4. Forward Traversal:");

        for (int i = 0; i < arr1.length; i++) {

            System.out.println(arr1[i]);
        }

        System.out.println("4. Reverse Traversal:");

        for (int i = arr1.length - 1; i >= 0; i--) {

            System.out.println(arr1[i]);
        }

        // 5. Enhanced For Loop
        System.out.println("5. Enhanced For Loop:");

        for (int num : arr1) {

            System.out.println(num);
        }

        // 6. Update Array Element
        arr1[0] = 10;

        System.out.println("6. Updated Array:");
        System.out.println(Arrays.toString(arr1));

        // 7. Input Array
        /*
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        */

        // 8. Print Array
        int[] arr2 = {1, 2, 3, 4};

        System.out.println("8. Print Array:");
        System.out.println(Arrays.toString(arr2));

        // 9. Sum of Array
        int sum = 0;

        for (int num : arr2) {

            sum += num;
        }

        System.out.println("9. Sum: " + sum);

        // 10. Find Maximum
        int max = arr2[0];

        for (int num : arr2) {

            if (num > max) {

                max = num;
            }
        }

        System.out.println("10. Maximum: " + max);

        // 11. Find Minimum
        int min = arr2[0];

        for (int num : arr2) {

            if (num < min) {

                min = num;
            }
        }

        System.out.println("11. Minimum: " + min);

        // 12. Reverse Array (Two Pointer)
        int[] arr3 = {1, 2, 3, 4, 5};

        int left = 0;
        int right = arr3.length - 1;

        while (left < right) {

            int temp = arr3[left];
            arr3[left] = arr3[right];
            arr3[right] = temp;

            left++;
            right--;
        }

        System.out.println("12. Reversed Array:");
        System.out.println(Arrays.toString(arr3));

        /*
        Two Pointer Pattern:
        - One pointer from start
        - One pointer from end
        - Move inward
        */

        // 13. Swap Elements
        int a = 10;
        int b = 20;

        System.out.println("13. Before Swap:");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("13. After Swap:");
        System.out.println("a = " + a + ", b = " + b);

        // 14. Sort Array
        int[] arr4 = {5, 2, 8, 1};

        Arrays.sort(arr4);

        System.out.println("14. Sorted Array:");
        System.out.println(Arrays.toString(arr4));

        // 15. Descending Sort
        Integer[] arr5 = {5, 2, 8, 1};

        Arrays.sort(arr5, Collections.reverseOrder());

        System.out.println("15. Descending Sort:");
        System.out.println(Arrays.toString(arr5));

        /*
        IMPORTANT:
        reverseOrder works with Integer[]
        NOT int[]
        */

        // 16. Copy Array
        int[] original = {1, 2, 3};

        int[] copy = Arrays.copyOf(original, original.length);

        System.out.println("16. Copied Array:");
        System.out.println(Arrays.toString(copy));

        // 17. Compare Arrays
        int[] arr6 = {1, 2, 3};
        int[] arr7 = {1, 2, 3};

        System.out.println("17. Arrays Equal: "
                + Arrays.equals(arr6, arr7));

        // 18. Fill Array
        int[] arr8 = new int[5];

        Arrays.fill(arr8, 7);

        System.out.println("18. Filled Array:");
        System.out.println(Arrays.toString(arr8));

        // 19. Frequency Array Pattern
        int[] arr9 = {1, 2, 2, 3, 1, 2};

        int[] freq = new int[10];

        for (int num : arr9) {

            freq[num]++;
        }

        System.out.println("19. Frequency of 2: "
                + freq[2]);

        /*
        Frequency Mapping:
        freq[1] -> count of 1
        freq[2] -> count of 2
        */

        // 20. Prefix Sum Basics
        int[] arr10 = {1, 2, 3, 4};

        int[] prefix = new int[arr10.length];

        prefix[0] = arr10[0];

        for (int i = 1; i < arr10.length; i++) {

            prefix[i] = prefix[i - 1] + arr10[i];
        }

        System.out.println("20. Prefix Sum:");
        System.out.println(Arrays.toString(prefix));

        /*
        prefix[i] =
        sum from index 0 to i
        */

        // 21. Sliding Window Basics
        int[] arr11 = {1, 2, 3, 4, 5};

        int k = 3;

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {

            windowSum += arr11[i];
        }

        System.out.println("21. First Window Sum: "
                + windowSum);

        // Slide window
        for (int i = k; i < arr11.length; i++) {

            windowSum += arr11[i];
            windowSum -= arr11[i - k];

            System.out.println("Window Sum: "
                    + windowSum);
        }

        /*
        Sliding Window:
        Add new element
        Remove old element
        */

        // 22. Two Pointer Basics
        int[] arr12 = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr12.length - 1;

        System.out.println("22. Two Pointer Traversal:");

        while (start < end) {

            System.out.println(arr12[start]
                    + " " + arr12[end]);

            start++;
            end--;
        }

        /*
        Used In:
        - Reverse Array
        - Pair Sum
        - Palindrome
        - Sorted Array Problems
        */
    }
}