package BoundaryMarchers;

import java.util.regex.Pattern;

public class BeginnigAndEndOfaLine {

    public static void main(String args[]) {

        String arr[] = {"Elephant9", "animal", "geeks", "i", "iiiii10", "ip2"};
        startWithaLetterEndWithaDigit(arr);



    }

    public static void startWithaLetterEndWithaDigit(String[] arr) {
        for (String str : arr) {
            if (Pattern.matches("^[A-Za-z]*\\d$",
                    str)) {
                System.out.println("YES \t" + str);
            } else {
                System.out.println("NO \t" + str);
            }
        }
    }
}
