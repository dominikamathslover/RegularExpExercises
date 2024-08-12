package Quantifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupsAndQuantifiers {

    public static void main(String[] args) {
        String text = "dogdogdogdogdogdog";
        String repl = "X";

        greedy(text, "(dog)", repl); // dog
        greedy(text, "(dog){2}", repl); // dogdog
        greedy(text, "dog{2}", repl); // gg
        greedy(text, "[dog]{6}", repl);

        greedy(text, "(dog)+", repl);
        greedy(text, "(dog)*", repl);
        greedy(text, "(dog)?", repl);



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