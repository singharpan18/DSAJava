package StringStriver;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class iSortCharactersByFrequency {

    public static String frequencySort(String s) {

        // Store frequency of characters
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Store unique characters
        List<Character> list = new ArrayList<>(map.keySet());

        // Sort by frequency in descending order
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Final answer
        StringBuilder result = new StringBuilder();

        // Build string using frequency
        for (char ch : list) {

            int freq = map.get(ch);

            // Add character freq times
            for (int i = 0; i < freq; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "tree";

        System.out.println(frequencySort(s));
    }
}