package ReplaceExercises;

import java.util.regex.*;

public class ReplaceSpaces {

    public static void main(String[] args) {
        String text = "geeks for geeks";
        String regex = "\\s";
        String replacement = "_";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String newText = matcher.replaceAll(replacement);
        System.out.println("New text: " + newText);
    }
}