package NumberPatterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AadhaarNumber {

    public static void main(String[] args) {

        String number = "3675 9834 6012";

        isValidAadhaarNumber(number);

    }


    public static void isValidAadhaarNumber(String number) {
        String regExp = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(number);

        if (matcher.matches()) {
            System.out.println(number + " is AadhaarNumber number");
        } else {
            System.out.println(number + " isn't AadhaarNumber number");
        }
    }


    /*
    Powinien mieć 12 cyfr.
    Nie powinien zaczynać się od 0 i 1.
    Nie powinien zawierać żadnego alfabetu ani znaków specjalnych.
    Powinien mieć odstęp po każdych 4 cyfrach.
     */
}