package NumberPatterns;

import java.util.regex.*;

public class NumerTEL {

    public static void main(String[] args) {
        String phone = "123-456-780";
        String regex = "^\\d{3}-\\d{3}-\\d{3}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        boolean isPhoneValid = matcher.matches();

        if (isPhoneValid) {
            System.out.println("Phone number is valid");
        } else {
            System.out.println("Phone number is invalid");
        }
    }
}
