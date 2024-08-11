package NumberPatterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsANumber {

    public static void main(String[] arg){
        //String text ="05.009";
        //String text ="105.009";
        //String text ="009";
        //String text =".009";
        String text ="9";
        isNumber(text);
    }


    public static void isNumber(String text){
        String regEx="^[1-9]{1}+[0-9]*+\\.+[0-9]*|^[0-9]{1}+\\.+[0-9]*|^[1-9]{1}+[0-9]*|^[1-9]{1}";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);

        System.out.println(text + " is a number: "+matcher.matches());

    }



}
