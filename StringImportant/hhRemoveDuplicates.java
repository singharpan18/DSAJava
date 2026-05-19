package StringImportant;

public class hhRemoveDuplicates {

    public static String removeDuplicates(String s) {

        boolean[] visited = new boolean[26];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // If character not visited
            if (!visited[ch - 'a']) {

                visited[ch - 'a'] = true;

                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "programming";

        System.out.println(removeDuplicates(s));
    }
}
/*
2. Without Set (Interview Logic)
Using frequency array / visited array. 
*/