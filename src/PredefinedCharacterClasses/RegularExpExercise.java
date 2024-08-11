package PredefinedCharacterClasses;

import java.util.regex.Matcher;
import java.util.regex.*;

public class RegularExpExercise {

    public static void main(String[] args) {


        String text = "Aktagta";
        String regExp = "[A-Za-z][a-z]*";

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);

        if (matcher.matches()) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }


    }
}


