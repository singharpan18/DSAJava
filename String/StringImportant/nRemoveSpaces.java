package String.StringImportant;

public class nRemoveSpaces {

    public static String removeSpaces1(String s) {

        // Replace spaces with empty string
        return s.replace(" ", "");
    }


    public static String removeSpaces(String s) {

        StringBuilder result = new StringBuilder();

        // Traverse string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Ignore spaces
            if (ch != ' ') {

                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "Java is fun";

        System.out.println(removeSpaces(s));
    }
}