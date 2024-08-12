package PredefinedCharacterClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args){

        String  text ="komsdn h89_2@KK ompLKJ#   -  ?2S! || !#$%^&*()~`{}[]:'/,q w+e p";
        //String regExp ="\\s";  //space
        //String regExp ="\\S";  //non-space
        //String regExp ="\\d"; //digit
        //String regExp ="\\D"; //non-digit
        //String regExp ="\\w";  //char or digit or _ (not: ?<.@ etc.)
        //String regExp ="\\W";  // !@#$%^&*()-.,+space
        //String regExp ="."; // any character
        //String regExp ="\\|";
        //String regExp ="\\Q|\\E";
        String regExp ="2S";


        checkRegularExp(text,regExp);


    }

    public static void checkRegularExp(String text, String regExp){

        String replacemnet ="X";

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);

        String newText= matcher.replaceAll(replacemnet);
        System.out.println("Before:\t" +text);
        System.out.println("After:\t"+newText);


    }


}
