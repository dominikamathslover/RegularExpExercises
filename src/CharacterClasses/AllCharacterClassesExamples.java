package CharacterClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllCharacterClassesExamples {
    public static void main(String[] args){
        //String text ="Ala ma kota";
        //String text ="AAAAAAAAAAAAA";
        //String text ="AAAAAAAAAAAAAd";
        //String text = "123 098xyz";
        //String text = "a123n 098xyoz";
        String text = "a123n 098sdxyoz rat";



        //String regExp ="[abc]"; // zawiera litery a b lub c
        //String regExp ="[^abc]"; //zawiera inne litery niż a b i c
        //String regExp ="[^ABC]"; // zwiera inne litery niż A B i C
        //String regExp ="[A-Za-z]"; // zawiera litery a-z lub A-Z
        //String regExp ="[a-d[m-p]]"; // zawiera litery a-d lub m-p
        //String regExp ="[a-f&&[dop]]"; // część wspolną a-f i dop czyli literę d
        //String regExp ="[a-f&&[^bc]]"; // różnica zbiorów a-f i bc = a,d,f
        //String regExp= "[bcr]at"; // słowo bat cat rat
        //String regExp = "[0-4[6-8]]"; // 0,1,2,3,4,6,7,8
        //String regExp ="[0-4&&[389]]"; // 3
        String regExp = "[5-9&&[^358]]"; // 6,7,9

        characterClass(text,regExp);

    }

    public static void characterClass(String text, String regExp){

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text: "+text);
        System.out.println("RegExp: "+regExp);
        System.out.println(matcher.find(pattern.flags()));

    }
}
