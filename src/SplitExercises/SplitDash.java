package SplitExercises;

public class SplitDash {
    public static void main(String[] args) {


        String text = "dom-pies-kot";
        String regEx = "-";
        String arr[] = text.split(regEx);

        for (String word : arr) {
            System.out.println(word);
        }

    }
}
