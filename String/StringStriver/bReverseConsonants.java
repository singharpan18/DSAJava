package String.StringStriver;
//arpan singh like i want agnas niprh
public class bReverseConsonants {

    // Function to check vowel
    public static boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static String reverseConsonants(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Skip vowels and spaces from left
            while (left < right &&
                    (isVowel(arr[left]) || arr[left] == ' ')) {

                left++;
            }

            // Skip vowels and spaces from right
            while (left < right &&
                    (isVowel(arr[right]) || arr[right] == ' ')) {

                right--;
            }

            // Swap consonants
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);//convert character array into String
    }

    public static void main(String[] args) {

        String s = "arpan singh";

        System.out.println(reverseConsonants(s));
    }
}
/*
We use two pointers and each character is visited at most once, so time complexity is O(n).
We convert the string into a character array for modification, which takes O(n) extra space.
*/