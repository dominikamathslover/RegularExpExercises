
import java.util.regex.*;

public class StartWithVowel {

    public static void main(String args[]) {
        String arr[] = {"Elephant", "animal", "geeks", "i","iiiii","ip"};

        for (String str : arr) {
            if (Pattern.matches("^[AEIOUaeiou][A-Za-z]*",
                    str)) {
                System.out.println(str + " is accepted");
            } else {
                System.out.println(str + " is not accepted");
            }
        }
    }
}