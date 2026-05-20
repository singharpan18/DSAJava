package String.StringStriver;
public class nSumBeautySubstrings {

    public static int beautySum(String s) {

        int totalBeauty = 0;

        // Choose starting index
        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[26];

            // Choose ending index
            for (int j = i; j < s.length(); j++) {

                // Add current character frequency
                freq[s.charAt(j) - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                // Find max and min frequency
                for (int count : freq) {

                    if (count > 0) {
                        maxFreq = Math.max(maxFreq, count);
                        minFreq = Math.min(minFreq, count);
                    }
                }

                // Add beauty of current substring
                totalBeauty += maxFreq - minFreq;
            }
        }

        return totalBeauty;
    }

    public static void main(String[] args) {

        String s = "aabcb";

        System.out.println(beautySum(s));
    }
}
/*
Beauty of a substring means:
maximum frequency - minimum frequency
*/