package BoundaryMarchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyRelPoss {

    public static void main(String[] args) {
        String text = "yfooyyyyyyfoofoo";
        String repl = "X";

        greedy(text, ".*foo", repl); //dowolny ciąg znaków kończący się na foo
        greedy(text, ".*?foo", repl); // foo i coś przed
        greedy(text, ".*+foo", repl);
        greedy(text, "foo", repl);

        String tex ="The doggie plays in the yard";

        greedy(tex, "\\bdog\\b", "0"); // nie ma słowa kończącego się i zaczynającego jak tutaj
        greedy(tex, "\\bdog", "0"); // słowo zaczynające się na dog
        greedy(tex, "dog\\b", "0"); // konczące się na dog
        greedy(tex, "\\bdog\\B", "0");
        greedy("The dog plays in the yard.", "\\bdog\\B", "0");
        greedy(tex, "\\AThe", "0");
        greedy(tex, "(yard)$", "0");

    }

    public static void greedy(String text, String regExp, String repl) {

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);
        String replacement = matcher.replaceAll(repl);


        System.out.println("Text: \n" + text);
        System.out.println("RegExp:\n" + regExp);
        System.out.println("Replacement: \n" + replacement + "\n");


    }
}

