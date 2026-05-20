package String.StringImportant;

public class aReverseString {

    public static String reverse1(String s) {

        // StringBuilder stores mutable string
        StringBuilder sb = new StringBuilder(s);

        // Reverse string
        sb.reverse();

        // Convert back to string
        return sb.toString();
    }
    

    public static String reverse(String s){
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String [] args){
        String s = "hello";
        System.out.println(reverse(s));
    }
}
/*
| Complexity | Value |
| ---------- | ----- |
| TC         | O(n)  |
| SC         | O(n)  |
Because char array uses extra space.
| Complexity | Value |
| ---------- | ----- |
| TC         | O(n)  |
| SC         | O(n)  |
Because StringBuilder creates extra string.
Collections.swap() -> Works only for List.
Because: strings are immutable, char array is not List. So manual swap is preferred.
*/
