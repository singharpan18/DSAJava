public class StringBasics {

    public static void main(String[] args) {

        // 1. String Declaration
        String s1 = "arpan";

        // 2. Length of String
        String s2 = "arpan";
        System.out.println("2. Length: " + s2.length());

        // 3. Access Character
        String s3 = "arpan";
        System.out.println("3. First Character: " + s3.charAt(0));

        // 4. Traverse String
        String s4 = "arpan";

        System.out.println("4. Forward Traversal:");

        for (int i = 0; i < s4.length(); i++) {

            System.out.println(s4.charAt(i));
        }

        System.out.println("4. Reverse Traversal:");

        for (int i = s4.length() - 1; i >= 0; i--) {

            System.out.println(s4.charAt(i));
        }

        // 5. String is Immutable
        String s5 = "arpan";

        s5.concat(" singh");

        System.out.println("5. Without Assigning: " + s5);

        s5 = s5.concat(" singh");

        System.out.println("5. After Assigning: " + s5);
        /*String is immutable in Java, so methods like concat(), replace(), or toUpperCase() do not modify the original 
        string. They create a new string object, which must be assigned back if we want the changes.*/

        // 6. Convert String to Char Array
        String s6 = "arpan";

        char[] arr1 = s6.toCharArray();////['a', 'r', 'p', 'a', 'n']

        System.out.println("6. First Element of Char Array: " + arr1[0]);

        // 7. Convert Character Uppercase / Lowercase
        char ch1 = 'A';

        System.out.println("7. Lowercase: " + Character.toLowerCase(ch1));

        // 8. Check Character Type
        System.out.println("8. Is Digit: " + Character.isDigit('5'));

        System.out.println("8. Is Letter: " + Character.isLetter('a'));

        System.out.println("8. Is Letter Or Digit: " + Character.isLetterOrDigit('a'));

        // 9. Substring
        String s7 = "arpan";

        System.out.println("9. Substring: " + s7.substring(1, 4));
        //substring(start, end) -> start included, end excluded

        // 10. Compare Strings
        String a = "hello";
        String b = "hello";

        if (a.equals(b)) {

            System.out.println("10. Both strings are equal");
        }

        // 11. Split String
        String s8 = "arpan singh";

        String[] arr2 = s8.split(" ");//["arpan", "singh"]

        System.out.println("11. First Word: " + arr2[0]);

        System.out.println("11. Second Word: " + arr2[1]);

        // 12. StringBuilder
        StringBuilder sb1 = new StringBuilder();

        sb1.append("arpan");

        sb1.append(" singh");

        System.out.println("12. StringBuilder Output: " + sb1);

        // 13. Reverse StringBuilder
        StringBuilder sb2 = new StringBuilder("arpan");

        System.out.println("13. Reversed String: " + sb2.reverse());

        // 14. Delete Character
        StringBuilder sb3 = new StringBuilder("arpan");

        sb3.deleteCharAt(1);

        System.out.println("14. After Delete: " + sb3);

        // 15. Insert Character
        StringBuilder sb4 = new StringBuilder("apan");

        sb4.insert(1, 'r');

        System.out.println("15. After Insert: " + sb4);

        // 16. Convert Integer ↔ String
        int num = Integer.parseInt("123");

        String str = String.valueOf(123);

        System.out.println("16. String to Integer: " + num);

        System.out.println("16. Integer to String: " + str);

        // 17. ASCII Values
        char ch2 = 'a';

        System.out.println("17. ASCII Value: " + (int) ch2);

        // 18. Frequency Array Basics
        String s9 = "apple";

        int[] freq = new int[26];// Index :  0 1 2 3 4 5 ... 25
        //Value :  0 0 0 0 0 0 ... 0

        for (int i = 0; i < s9.length(); i++) {

            freq[s9.charAt(i) - 'a']++;////ITERATION 2 -> i = 1 -> s.charAt(1) = 'p' -> 'p' - 'a' -> 112 - 97 = 15
        }

        System.out.println("18. Character Frequencies:");

        for (int i = 0; i < 26; i++) {

            if (freq[i] > 0) {

                System.out.println((char) (i + 'a') + " -> " + freq[i]);
            }
        }

        // 19. Common Loop Pattern
        String s10 = "arpan";

        System.out.println("19. Traversing Using Common Pattern:");

        for (int i = 0; i < s10.length(); i++) {

            char ch = s10.charAt(i);

            System.out.println(ch);
        }

        // 20. String With Space
        String s11 = "arpan singh";

        System.out.println("20. String With Space: " + s11);

        // 21. Space is Also a Character
        String s12 = "a b";

        System.out.println("21. Length Including Space: " + s12.length());

        // 22. Access Space Using charAt()
        String s13 = "arpan singh";

        System.out.println("22. Character At Index 5: " + s13.charAt(5));

        // 23. Check Space
        char ch3 = ' ';

        if (ch3 == ' ') {

            System.out.println("23. Space found");
        }

        // 24. Remove Spaces
        String s14 = "arpan singh";

        s14 = s14.replace(" ", "");

        System.out.println("24. After Removing Spaces: " + s14);

        // 25. Split Words Using Space
        String s15 = "arpan singh raj";

        String[] arr3 = s15.split(" ");

        System.out.println("25. Word 1: " + arr3[0]);

        System.out.println("25. Word 2: " + arr3[1]);

        System.out.println("25. Word 3: " + arr3[2]);

        // 26. Traverse Including Spaces
        String s16 = "hi bro";

        System.out.println("26. Traversal Including Spaces:");

        for (int i = 0; i < s16.length(); i++) {

            char ch = s16.charAt(i);

            System.out.println(ch);
        }

        // 27. Ignore Spaces During Traversal
        String s17 = "hi bro";

        System.out.println("27. Traversal Ignoring Spaces:");

        for (int i = 0; i < s17.length(); i++) {

            char ch = s17.charAt(i);

            if (ch == ' ') {

                continue;
            }

            System.out.println(ch);
        }

        // 28. Multiple Spaces Problem
        String s18 = "   arpan singh   ";

        System.out.println("28. After Trim: " + s18.trim());

        // 29. Replace Multiple Spaces
        String s19 = "arpan    singh";

        s19 = s19.replaceAll("\\s+", " ");

        System.out.println("29. After Replacing Multiple Spaces: " + s19);

    }
}