import java.util.regex.*;

class GFG {
    public static void main(String args[]) {
        String str[] = {"_Geeks9", "$Geeks20203", "9for_y", "Geeks_For_Geeks"};

        Pattern p = Pattern.compile("^[_$a-zA-Z][a-zA-Z0-9_$]*$");


        for (String i : str) {
            Matcher m = p.matcher(i);
            String string = "";
            while (m.find()) {
                string += m.group();
            }

            if (!string.equals("")) {
                System.out.println(
                        string + " is  a valid variable name");
            }
        }
    }
}