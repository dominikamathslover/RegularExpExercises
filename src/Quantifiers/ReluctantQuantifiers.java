package Quantifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReluctantQuantifiers {

    public static void main(String[] args) {
        String text = "aaaaaaa Alaaa maa kota";
        String repl = "X";

        greedy(text, "a??", repl); // a-> Xa, A-> XA, aaa->XaXaXa
        greedy(text, "a*?", repl); // a-> Xa, A-> XA, aaa->XaXaXa
        greedy(text, "a+?", repl); // a-> X, A -> A, aaa -> XXX
        greedy(text, "a{3}?", repl); // aaa-> X
        greedy(text, "a{3,}?", repl); // at least 3
        greedy(text, "a{3,5}?", repl); // between 3-5


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


