package String.StringImportant;

public  class pPrintAllSubstrings {

    public static void printSubstrings(String s) {

        for (int i = 0; i < s.length(); i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = i; j < s.length(); j++) {

                sb.append(s.charAt(j));

                System.out.println(sb);
            }
        }
    }

    public static void main(String[] args) {

        String s = "abc";

        printSubstrings(s);
    }
} 
