package ReplaceExercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDigit {

    public static void main(String[] args){

        //String text  = "bla bla bla ";
        String text ="Arbuz to niemal w 100% woda, dlatego też stanowi doskonałe orzeźwienie.\n Poza tym jest też niskokaloryczny (30 kcal na 100 g owocu),\n więc idealny dla osób, które chcą zrzucić zbędne kilogramy.";
        String regEx = "\\d";
        String replacement = "_";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        String newText = matcher.replaceAll(replacement);
        System.out.println("New text: "+newText );
    }
}
