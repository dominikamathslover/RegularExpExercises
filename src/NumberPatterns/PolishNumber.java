package NumberPatterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PolishNumber {


    public static void main(String[] args) {

        String text1 ="+48-567-778-999";
        String reg1="^\\+48-+\\d{3}+-+\\d{3}+-+\\d{3}$";


        //String regex = "^[a-zA-Z0-9_]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(reg1);
        Matcher matcher = pattern.matcher(text1);

        System.out.println("Is Polish number?: "+matcher.matches());


    }
}
