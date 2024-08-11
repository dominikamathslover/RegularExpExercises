package URLemailPatterns;

import java.util.regex.*;

public class ExtractURL {

    public static void main(String[] args) {
        String text = "This is a website: https://www.geeksforgeeks.org";
        // // String text = "This is a website: https://geeksforgeeks.org";  // pasuje, a nie powinno
        // String text = "This is a website: https://.www.geeksforgeeks.org"; //- nie jest a pasuje do formuły
        // // String regex = "https://[\\w\\.\\-]+\\.[a-z]{2,6}";
        // String regex = "https?://[\\w\\.\\-]+\\.[a-z]{2,6}";

        String regex = "https://www.[\\w\\.\\-]+\\.[a-z]{2,6}"; // poprawiony kod

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String url = matcher.group();
            System.out.println("URL found: " + url);
        }
    }
}