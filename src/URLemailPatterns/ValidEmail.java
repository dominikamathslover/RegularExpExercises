package URLemailPatterns;

import java.util.regex.*;

public class ValidEmail {

    public static void main(String[] args)
    {
        String email = "hello_World@geeksfor-geeks.org";
        String regex = "^[a-zA-Z0-9_]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        boolean isEmailValid = matcher.matches();

        if (isEmailValid) {
            System.out.println("Email is valid");
        }
        else {
            System.out.println("Email is invalid");
        }
    }
}