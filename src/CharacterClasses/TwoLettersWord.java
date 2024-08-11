package CharacterClasses;

import java.util.regex.Pattern;

public class TwoLettersWord {

    public static void main(String args[]) {
        String arr[] = {"Elephant", "animal", "to", "i", "iii", "ip"};

        for (String str : arr) {
            if (Pattern.matches("^[A-Za-z][A-Za-z]$",
                    str)) {
                System.out.println(str + " YES");
            } else {
                System.out.println(str + " NO ");
            }
        }
    }
}

