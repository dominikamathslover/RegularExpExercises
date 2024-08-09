public class SplitTwoArg {
    public static void main(String[] args) {

        String text ="GeekSs@for@gEekss";
        //String regExp ="@";
        //String regExp ="o";
        //String regExp ="s";
        //String regExp ="[A-Z]";
        String regExp ="[, ?.@]";

        splitNew(text,regExp);

    }

    public static void splitNew(String text,String regExp ){
        String arg[] = text.split(regExp);

        System.out.println("Text: "+ text);
        System.out.println("Regular Expression: "+regExp);

        for(String word: arg){
            System.out.println(word);
        }

        System.out.println(arg.length);
    }


}
