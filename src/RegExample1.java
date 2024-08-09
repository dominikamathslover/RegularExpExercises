import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExample1 {

    public static void main(String[] args){
        //String email = "user@example.com";
        String email = "user_9@example.com";
        Pattern pattern=Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        System.out.println("Email Valid: " + matcher.matches());

        String password = "Aa123456!";
        Pattern pattern2 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}");
        Matcher matcher2 = pattern2.matcher(password);
        System.out.println("Password Strong: " + matcher2.matches());

        String text = "Regex is #1 at pattern matching!";
        Pattern wordPattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher3 = wordPattern.matcher(text);

        while (matcher3.find()) {
            System.out.println(matcher3.group());
        }
    }

}
