package SplitExercises;

public class SplitExercise {

    public static void main(String args[]) {
        String str = "charitha@gmail.com";
        String regex = "@";
        String arr[] = str.split(regex);

        System.out.println("User name : " + arr[0]);

        System.out.println("Domain name : " + arr[1]);
    }


}

