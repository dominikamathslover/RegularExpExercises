

public class SplitComma {

    public static void main(String args[]) {
        String str = "Heart-wrenching, bone-chilling, tongue-in-cheek, bittersweet, otherworldly, ethereal, gravity-defying, kaleidoscopic";
        String regex = ", ";
        String arr[] = str.split(regex);

        for (String word : arr) {
            System.out.println(word);
        }

    }
}
