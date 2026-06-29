package String.StringStriver;
import java.util.HashMap;

public class eIsomorphicString {

    public static boolean isIsomorphic(String s, String t) {

        // Length must be same
        if (s.length() != t.length()) {
            return false;
        }

        // Map for s -> t
        HashMap<Character, Character> map1 = new HashMap<>();

        // Map for t -> s
        HashMap<Character, Character> map2 = new HashMap<>();

        // Traverse both strings
        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // Check s -> t mapping
            if (map1.containsKey(ch1)) {

                // Existing mapping should match Once a character is mapped, it must always map to the same character.
                if (map1.get(ch1) != ch2) {
                    return false;
                }
            }
            else {
                map1.put(ch1, ch2);
            }

            // Check t -> s mapping
            if (map2.containsKey(ch2)) {

                // Existing reverse mapping should match
                if (map2.get(ch2) != ch1) {
                    return false;
                }
            }
            else {
                map2.put(ch2, ch1);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t));
    }
} 
/*
Example 1 (valid Case)
| i | ch1 from s | ch2 from t | map1 contains ch1? | Existing Mapping | Current Mapping | Result        |
| - | ---------- | ---------- | ------------------ | ---------------- | --------------- | ------------- |
| 0 | e          | a          | No                 | —                | e → a           | Store mapping |
| 1 | g          | d          | No                 | —                | g → d           | Store mapping |
| 2 | g          | d          | Yes                | g → d            | g → d           | Valid         |

Example 2 (Invalid Case)
| i | ch1 from s | ch2 from t | map1 contains ch1? | Existing Mapping | Current Mapping | Result        |
| - | ---------- | ---------- | ------------------ | ---------------- | --------------- | ------------- |
| 0 | f          | b          | No                 | —                | f → b           | Store mapping |
| 1 | o          | a          | No                 | —                | o → a           | Store mapping |
| 2 | o          | r          | Yes                | o → a            | o → r           | Invalid       |

| Code          | Meaning                    |
| ------------- | -------------------------- |
| map1.get(ch1) | Old mapping                |
| ch2           | Current mapping            |
| !=            | Different mapping found    |
| return false  | Invalid isomorphic mapping |


I used two HashMaps to maintain one-to-one mapping in both directions.
We traverse strings once, so time complexity is O(n), and HashMaps take O(n) space.
*/