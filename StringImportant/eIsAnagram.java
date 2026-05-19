package StringImportant;

import java.util.Arrays;

public class eIsAnagram {

    public static boolean isAnagram(String s1, String s2) {

        // Convert strings into char array
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted strings
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        System.out.println(isAnagram(s1, s2));
    }
    
}
